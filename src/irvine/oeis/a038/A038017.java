package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a030.A030257;

/**
 * A038017 Number of n-element commutative groupoids with an identity ("pointed" groupoids).
 * @author Sean A. Irvine
 */
public class A038017 extends A030257 {

  {
    setOffset(1);
  }

  @Override
  protected int start() {
    return 0;
  }

  @Override
  protected Z fix(final int[] j) {
    return super.fix(j).multiply(j[1]);
  }
}

