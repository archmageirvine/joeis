package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059373 Second diagonal of triangle in A059370.
 * @author Sean A. Irvine
 */
public class A059373 extends A059370 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    for (int k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
