package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a060.A060158;

/**
 * A000486.
 * @author Sean A. Irvine
 */
public class A000486 extends A060158 {

  {
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
