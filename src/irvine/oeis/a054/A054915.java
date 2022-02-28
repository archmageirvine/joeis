package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000088;
import irvine.oeis.a001.A001349;

/**
 * A054915 Number of unlabeled connected graphs with n nodes such that complement is also connected.
 * @author Sean A. Irvine
 */
public class A054915 extends A001349 {

  private final Sequence mA = new A000088();
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mA.next());
  }
}
