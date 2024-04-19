package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060371 a(n) = (prime(n) - 1)! + 1.
 * @author Sean A. Irvine
 */
public class A060371 extends A000040 {

  @Override
  public Z next() {
    return Functions.FACTORIAL.z(super.next().subtract(1)).add(1);
  }
}
