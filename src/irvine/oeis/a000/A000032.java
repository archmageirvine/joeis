package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000032 Lucas numbers beginning at 2: L(n) = L(n-1) + L(n-2), L(0) <code>= 2,</code> L(1) <code>= 1</code>.
 * @author Sean A. Irvine
 */
public class A000032 implements Sequence {

  private Z mA = Z.THREE;
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z n = mA.add(mB);
    mA = mB;
    mB = n;
    return n;
  }

}

