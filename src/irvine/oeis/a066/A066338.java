package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066338 Decimal equivalent of A066330.
 * @author Sean A. Irvine
 */
public class A066338 extends A066330 {

  @Override
  public Z next() {
    return new Z(super.next().toString(), 2);
  }
}
