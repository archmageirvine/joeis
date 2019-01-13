package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a123.A123071;

/**
 * A005631.
 * @author Sean A. Irvine
 */
public class A005631 extends A123071 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
