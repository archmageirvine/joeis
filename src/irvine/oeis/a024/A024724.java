package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024724.
 * @author Sean A. Irvine
 */
public class A024724 extends A024723 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
