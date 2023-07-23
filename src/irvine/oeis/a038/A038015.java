package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a030.A030247;

/**
 * A038015 Number of pointed (distinguished element) idempotent groupoids.
 * @author Sean A. Irvine
 */
public class A038015 extends A030247 {

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

