package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a005.A005867;

/**
 * A058251 LCM of n-th primorial number and its Euler totient.
 * @author Sean A. Irvine
 */
public class A058251 extends A002110 {

  private final Sequence mA = new A005867();

  @Override
  public Z next() {
    return super.next().lcm(mA.next());
  }
}
