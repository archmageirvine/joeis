package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a035.A035928;

/**
 * A066489 Binary expansion of n followed by its complement.
 * @author Sean A. Irvine
 */
public class A066489 extends A035928 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}
