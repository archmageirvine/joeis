package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A083123 Smallest n-digit palindromic multiple of n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A084026 extends A084024 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}

