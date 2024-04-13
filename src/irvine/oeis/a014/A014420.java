package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A014420 Minimal number of Catalan numbers that sum to n.
 * @author Sean A. Irvine
 */
public class A014420 extends A014418 {

  @Override
  public Z next() {
    return Functions.DIGIT_SUM.z(super.next());
  }
}
