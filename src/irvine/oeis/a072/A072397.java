package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A056964.
 * @author Sean A. Irvine
 */
public class A072397 extends A072396 {

  @Override
  public Z next() {
    return Functions.FIBONACCI.z(super.next());
  }
}
