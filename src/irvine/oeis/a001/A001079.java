package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001079 a(n) = 10*a(n-1) - a(n-2); a(0) = 1, a(1) = 5.
 * @author Sean A. Irvine
 */
public class A001079 implements Sequence {

  private Z mA = Z.valueOf(49);
  private Z mB = Z.FIVE;

  @Override
  public Z next() {
    final Z t = mB.multiply(10).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

