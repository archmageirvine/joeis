package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.oeis.a036.A036987;

/**
 * A043529 Number of distinct base-2 digits of n.
 * @author Sean A. Irvine
 */
public class A043529 extends A036987 {

  @Override
  public Z next() {
    return Z.TWO.subtract(super.next());
  }
}
