package irvine.oeis.a154;
// manually 2021-07-24

import irvine.math.z.Z;
import irvine.oeis.a033.A033308;

/**
 * A154730 Decimal expansion of 1 minus the Copeland-Erdos constant.
 * @author Georg Fischer
 */
public class A154730 extends A033308 {

  @Override
  public Z next() {
    return Z.NINE.subtract(super.next());
  }
}
