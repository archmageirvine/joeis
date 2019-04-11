package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001353 <code>a(n) = 4*a(n-1) - a(n-2)</code> with <code>a(0) = 0, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A001353 implements Sequence {

  private Z mA = Z.valueOf(-4);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(2).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
