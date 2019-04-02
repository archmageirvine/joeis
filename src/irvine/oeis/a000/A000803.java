package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000803 a(n+3) = a(n+2) + a(n+1) + a(n) - 4.
 * @author Sean A. Irvine
 */
public class A000803 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.valueOf(-8);
  private Z mC = Z.valueOf(12);

  @Override
  public Z next() {
    final Z t = mA.add(mB).add(mC).subtract(4);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}

