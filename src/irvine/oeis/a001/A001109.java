package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001109 a(n)^2 is a triangular number: a(n) = 6*a(n-1) - a(n-2) with a(0)=0, a(1)=1.
 * @author Sean A. Irvine
 */
public class A001109 implements Sequence {

  private Z mA = Z.valueOf(-6);
  private Z mB = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(6).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

