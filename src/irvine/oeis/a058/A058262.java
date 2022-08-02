package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005867;

/**
 * A058262 a(n) is the quotient obtained when the totient of primorial (that is, the product of p-1 values) is divided by the LCM of the same p-1 values.
 * @author Sean A. Irvine
 */
public class A058262 extends A005867 {

  private final Sequence mA = new A058254();
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
