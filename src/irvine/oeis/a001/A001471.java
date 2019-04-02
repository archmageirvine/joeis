package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001471 Number of degree-n permutations of order exactly 3.
 * @author Sean A. Irvine
 */
public class A001471 implements Sequence {

  private Z mA = Z.ZERO;
  private Z mB = Z.ZERO;
  private Z mC = Z.TWO.negate();
  private long mN = -2;

  @Override
  public Z next() {
    ++mN;
    final Z t = mC.add(mA.add(1).multiply(mN).multiply(mN - 1));
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}

