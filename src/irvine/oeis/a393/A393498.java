package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A393498 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A393498 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private int mN = 3;
  private int mM = 3;
  private long[] mRow = null;

  /** Construct the sequence. */
  public A393498() {
    super(4);
  }

  @Override
  public Z next() {
    if (++mM >= mN - 1) {
      mRow = new long[++mN];
      mM = 2;
      for (int k = mN - 2, j = 2; k >= j; --k, ++j) {
        // k is the longer piece
        final long pMul = LongUtils.pow(10, k - 1);
        final long pStart = mPrime.nextPrime(pMul);
        final long pLim = pMul * 10;
        final long qMul = LongUtils.pow(10, j - 1);
        final long qStart = mPrime.nextPrime(qMul);
        final long qLim = qMul * 10;
        for (long p = pStart; p < pLim; p = mPrime.nextPrime(p)) {
          final int sp = Functions.SYNDROME.i(p);
          if (Integer.bitCount(sp) <= j) {
            for (long q = qStart; q < qLim; q = mPrime.nextPrime(q)) {
              if (Functions.SYNDROME.i(q) == sp) {
                if (q <= p || k != j) { // avoid double counting
                  // Try p : q
                  if (mPrime.isPrime(p * qLim + q)) {
                    //System.out.println((p * qLim + q) + " = " + p + ":" + q);
                    ++mRow[k];
                  }
                  // Try q : p
                  if (p != q && mPrime.isPrime(q * pLim + p)) {
                    //System.out.println((q * pLim + p) + " = " + q + ":" + p);
                    ++mRow[j];
                  }
                }
              }
            }
          }
        }
      }
      //System.out.println(Arrays.toString(mRow));
    }
    return Z.valueOf(mRow[mM]);
  }
}

