package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000111;

/**
 * A006217.
 * @author Sean A. Irvine
 */
public class A006217 extends A000111 {

  {
    super.next();
  }

  private Z mA = super.next().multiply(4);
  private Z mB = super.next().multiply(4);

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next().multiply(4);
    return Z.FIVE.max(mB.subtract(t));
  }
}
