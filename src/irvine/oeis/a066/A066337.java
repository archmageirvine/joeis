package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066337 Decimal equivalent of A066327.
 * @author Sean A. Irvine
 */
public class A066337 extends A066327 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 2);
  }
}
