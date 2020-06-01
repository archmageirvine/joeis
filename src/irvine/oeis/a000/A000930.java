package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000930 Narayana's cows sequence: <code>a(0) = a(1) = a(2) = 1;</code> thereafter <code>a(n) = a(n-1) + a(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A000930 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.ZERO;
  private Z mC = Z.ZERO;

  @Override
  public Z next() {
    final Z t = mA.add(mC);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
