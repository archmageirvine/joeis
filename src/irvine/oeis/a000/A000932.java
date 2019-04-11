package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000932 <code>a(n) = a(n-1) + n*a(n-2)</code>; <code>a(0) = a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A000932 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z t = mB.add(mA.multiply(mN));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
