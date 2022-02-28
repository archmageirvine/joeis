package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000595;

/**
 * A054920 Number of connected unlabeled reflexive relations with n nodes such that complement is also connected.
 * @author Sean A. Irvine
 */
public class A054920 extends A054919 {

  private final Sequence mA = new A000595();
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mA.next());
  }
}
