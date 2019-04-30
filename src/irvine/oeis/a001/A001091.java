package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001091 <code>a(n) = 8a(n-1) - a(n-2); a(0) = 1, a(1) = 4</code>.
 * @author Sean A. Irvine
 */
public class A001091 implements Sequence {

  private Z mA = Z.valueOf(31);
  private Z mB = Z.FOUR;

  @Override
  public Z next() {
    final Z t = mB.shiftLeft(3).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

