package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002182;

/**
 * A053878 Difference between numerator and denominator of lowest terms fraction from division of a highly composite number (1) by its predecessor.
 * @author Sean A. Irvine
 */
public class A053878 extends A002182 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z b = mA;
    mA = super.next();
    final Q t = new Q(mA, b);
    return t.num().subtract(t.den());
  }
}
