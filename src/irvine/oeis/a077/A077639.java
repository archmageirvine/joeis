package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a051.A051451;

/**
 * A077639 LCM of terms in period of continued fraction expansion of square root of A051451(n), i.e., sqrt(lcm(1..x)) where x is a prime power from A000961.
 * @author Sean A. Irvine
 */
public class A077639 extends A077632 {

  private final Sequence mA = new A051451();

  @Override
  public Z next() {
    return lcm(mA.next());
  }
}
