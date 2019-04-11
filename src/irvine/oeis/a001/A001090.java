package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001090 <code>a(n) = 8*a(n-1) - a(n-2)</code>; <code>a(0) = 0, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A001090 implements Sequence {

  private Z mA = Z.valueOf(-8);
  private Z mB = Z.valueOf(-1);

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(3).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

