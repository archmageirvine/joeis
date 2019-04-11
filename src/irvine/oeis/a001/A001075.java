package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001075 <code>a(0) = 1, a(1) = 2, a(n) = 4*a(n-1) - a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A001075 implements Sequence {

  private Z mA = Z.SEVEN;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(2).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

