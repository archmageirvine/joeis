package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A072521.
 * @author Sean A. Irvine
 */
public class A072522 extends A072521 {

  @Override
  public Z next() {
    return Functions.TRINV.z(super.next());
  }
}
