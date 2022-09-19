package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002260;
import irvine.oeis.a004.A004736;

/**
 * A059380 Array of values of Jordan function J_k(n) read by antidiagonals (version 2).
 * @author Sean A. Irvine
 */
public class A059380 implements Sequence {

  private final Sequence mA = new A002260();
  private final Sequence mB = new A004736();

  @Override
  public Z next() {
    return A059379.jordanTotient(mA.next().longValueExact(), mB.next().longValueExact());
  }
}
