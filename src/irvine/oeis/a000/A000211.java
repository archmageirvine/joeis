package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000211 <code>a(n) = a(n-1) + a(n-2) - 2</code>.
 * @author Sean A. Irvine
 */
public class A000211 implements Sequence {

  private Z mA = Z.FIVE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z r = mA.add(mB).subtract(2);
    mA = mB;
    mB = r;
    return r;
  }
}

