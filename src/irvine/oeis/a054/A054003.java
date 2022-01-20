package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a053.A053249;

/**
 * A054003 tau(n+1) - tau(n) where n and n+1 have the same sum of divisors.
 * @author Sean A. Irvine
 */
public class A054003 extends A054002 {

  private final Sequence mA = new A053249();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}

