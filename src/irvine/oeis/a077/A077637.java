package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a051.A051451;

/**
 * A077637 Largest term in periodic part of continued fraction expansion of square root of A051451(n), i.e., sqrt(lcm(1..x)) where x is a prime power from A000961.
 * @author Sean A. Irvine
 */
public class A077637 extends A077624 {

  private final Sequence mA = new A051451();

  @Override
  public Z next() {
    return maxTerm(mA.next());
  }
}
