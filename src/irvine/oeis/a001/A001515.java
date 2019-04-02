package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001515 Bessel polynomial y_n(x) evaluated at x=1.
 * @author Sean A. Irvine
 */
public class A001515 implements Sequence {

  private Z mA = Z.TWO;
  private Z mB = Z.ONE;
  private long mN = -3;

  @Override
  public Z next() {
    mN += 2;
    final Z t = mB.multiply(mN).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
