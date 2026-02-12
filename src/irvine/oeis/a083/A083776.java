package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083776 The n-th row of the following triangle contains n distinct primes such that the product of (n-1) of them + 2 is prime in all cases. The first (n-1) numbers are the smallest set whose product +2 is a prime and the n-th term is chosen to satisfy the requirement. a(1) = 2 by convention. Sequence contains the triangle by rows.
 * @author Sean A. Irvine
 */
public class A083776 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mM = -1;
  private long mP = 2;
  private Z[] mRow = {Z.TWO};

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mM = 0;
      mRow = new Z[mRow.length + 1];
      mP = mPrime.nextPrime(mP);
      Z q = Z.TWO;
      Z prod = Z.ONE;
      for (int k = 0; k < mRow.length - 2; ++k) {
        q = mPrime.nextPrime(q);
        mRow[k] = q;
        prod = prod.multiply(q);
      }
      long p = mP;
      while (!prod.multiply(p).add(2).isProbablePrime()) {
        p = mPrime.nextPrime(p);
      }
      mRow[mRow.length - 2] = Z.valueOf(p);
      final Z prodP = prod.multiply(p);
      final Z[] w = new Z[mRow.length - 1];
      for (int k = 0; k < w.length; ++k) {
        w[k] = prodP.divide(mRow[k]);
      }
      int c = 0;
      while (c < w.length) {
        c = 0;
        p = mPrime.nextPrime(p);
        while (c < w.length && w[c].multiply(p).add(2).isProbablePrime()) {
          ++c;
        }
      }
      mRow[mRow.length - 1] = Z.valueOf(p);
    }
    return mRow[mM];
  }
}
