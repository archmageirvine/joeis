package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;

/**
 * A022327 Least k such that first k terms of Kolakoski sequence <code>(A000002)</code> contain n more <code>1</code>'s than <code>2</code>'s.
 * @author Sean A. Irvine
 */
public class A022327 extends A000002 {

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
