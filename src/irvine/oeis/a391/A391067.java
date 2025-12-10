package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A391067 allocated for Fl\u00e1vio V. Fernandes.
 * @author Sean A. Irvine
 */
public class A391067 extends A391066 {

  @Override
  public Z next() {
    return Functions.VALUATION.z(super.next(), 2);
  }
}
