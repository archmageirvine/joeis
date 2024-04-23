package irvine.oeis.a057;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000120;

/**
 * A057334 In A000120, replace each entry k with the k-th prime and replace 0 with 1.
 * @author Sean A. Irvine
 */
public class A057334 extends A000120 {

  @Override
  public Z next() {
    return Functions.PRIME.z(super.next());
  }
}
