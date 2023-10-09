package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066336 Decimal equivalent of A066334.
 * @author Sean A. Irvine
 */
public class A066336 extends A066334 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 2);
  }
}
