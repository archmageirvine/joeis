package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004146 Alternate Lucas numbers <code>- 2</code>.
 * @author Sean A. Irvine
 */
public class A004146 implements Sequence {

  private Z mA = Z.FIVE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(3).subtract(mA).add(2);
    mA = mB;
    mB = t;
    return t;
  }
}
