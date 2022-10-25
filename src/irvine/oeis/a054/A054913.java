package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001187;
import irvine.oeis.a006.A006125;

/**
 * A054913 Number of labeled connected graphs with n nodes such that complement is also connected.
 * @author Sean A. Irvine
 */
public class A054913 extends A001187 {

  private final Sequence mA = new A006125();
  {
    setOffset(1);
    next();
  }

  @Override
  public Z next() {
    return super.next().multiply2().subtract(mA.next());
  }
}
