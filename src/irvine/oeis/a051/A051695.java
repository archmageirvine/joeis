package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001473;

/**
 * A051695 Number of degree-n even permutations of order exactly 4.
 * @author Sean A. Irvine
 */
public class A051695 extends A001473 {

  private final Sequence mA = new A051685();

  @Override
  public Z next() {
    return super.next().add(mA.next()).divide2();
  }
}
