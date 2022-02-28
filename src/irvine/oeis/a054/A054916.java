package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005176;
import irvine.oeis.a005.A005177;

/**
 * A054916 Number of connected unlabeled regular graphs with n nodes such that complement is also connected.
 * @author Sean A. Irvine
 */
public class A054916 extends A005177 {

  private final Sequence mA = new A005176();
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mA.next());
  }
}
