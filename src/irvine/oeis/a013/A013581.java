package irvine.oeis.a013;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A013581 Let P <code>= 2*3*5*..*p_n = n-th</code> primorial number <code>(A002110), G = Z_2xZ_3x...xZ_{p_n}; a(n) = max{e</code> in <code>G} min{i</code> : both <code>e+i, e-i</code> are relatively prime to <code>P}</code>.
 * @author Sean A. Irvine
 */
public class A013581 implements Sequence {

  // I think you definitely only need to look as far as p_n#/2
  // Empirically (n+1)! is far enough
  // Possibly (n-1)*n! is far enough
  // Be careful using this to extend the sequence

  private final Fast mPrime = new Fast();
  private long mP = 1;
  //private long mPrimorial = 1;
  private long mBound = 1;
  private long mN = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    //mPrimorial *= mP;
    mBound *= ++mN; // Empirical bound on how far needs to be searched

    // Sieve to solve coprimes
    final long limit = mBound * mN;
    final LongDynamicBooleanArray sieve = new LongDynamicBooleanArray();
    for (long p = 2; p <= mP; p = mPrime.nextPrime(p)) {
      for (long q = 0; q <= limit; q += p) {
        sieve.set(q);
      }
    }
    long max = 0;
    //long bestE = 0;
    //for (long e = 0; e < mPrimorial / 2; ++e) {
    for (long e = 0; e <= limit; ++e) {
      for (long i = 0; i < e; ++i) {
        if (!sieve.isSet(e + i) && !sieve.isSet(e - i)) {
          if (i > max) {
            max = i;
            //bestE = e;
          }
          break;
        }
      }
    }
    //System.out.println("e=" + bestE + " mPrimorial=" + mPrimorial + " " + mBound + " " + (double) bestE / (double) limit);
    return Z.valueOf(max);
  }
}
