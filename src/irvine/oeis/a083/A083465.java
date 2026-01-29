package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083465 Diagonal of A083464.
 * @author Sean A. Irvine
 */
public class A083465 extends A083464 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    for (long k = 0; k < mN; ++k) {
      super.next();
    }
    return super.next();
  }
}
