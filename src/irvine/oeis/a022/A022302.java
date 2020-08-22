package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022302 Least k such that first k terms of A022300 contain n more 1's than 2's.
 * @author Sean A. Irvine
 */
public class A022302 extends A022300 {

  private long mExcess = 0;
  private long mOnes = 0;

  @Override
  public Z next() {
    ++mExcess;
    while (true) {
      if (Z.ONE.equals(super.next())) {
        ++mOnes;
      }
      final long twos = mN + 1 - mOnes;
      if (mOnes >= twos + mExcess) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}
