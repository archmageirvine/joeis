package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000666;

/**
 * A054922 Number of connected unlabeled symmetric relations (graphs with loops) having n nodes such that complement is also connected.
 * @author Sean A. Irvine
 */
public class A054922 extends A054921 {

  private final Sequence mA = new A000666();
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mA.next());
  }
}
