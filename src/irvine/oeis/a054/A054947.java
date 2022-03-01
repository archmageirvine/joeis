package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006125;

/**
 * A054947 Enumerates pairs consisting of a strongly connected labeled tournament and an arbitrary labeled tournament.
 * @author Sean A. Irvine
 */
public class A054947 extends A054946 {

  private final Sequence mA = new A006125();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(mA.next());
  }
}
