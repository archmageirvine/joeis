package irvine.oeis.a166;

import irvine.math.z.Z;
import irvine.oeis.a141.A141468;

/**
 * A166039 Sums of three consecutive nonprimes A141468.
 * @author Sean A. Irvine
 */
public class A166039 extends A141468 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z p = mA;
    mA = mB;
    mB = super.next();
    return mA.add(mB).add(p);
  }
}
