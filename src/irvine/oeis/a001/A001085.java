package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001085 a(n) = 20*a(n-1) - a(n-2).
 * @author Sean A. Irvine
 */
public class A001085 extends Sequence0 {

  private Z mA = Z.valueOf(199);
  private Z mB = Z.TEN;

  @Override
  public Z next() {
    final Z t = mB.multiply(20).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

