package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000312;

/**
 * A066588 The sum of the digits of n^n.
 * @author Sean A. Irvine
 */
public class A066588 extends A000312 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
