package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a065.A065128;

/**
 * A011787 Number of n X n matrices over Z_4 whose determinant is 1.
 * @author Sean A. Irvine
 */
public class A011787 extends A065128 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
