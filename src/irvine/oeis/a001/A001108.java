package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001108 a(n)-th triangular number is a square: <code>a(n+1) = 6*a(n)-a(n-1)+2</code>, with <code>a(0) = 0, a(1) = 1</code>.
 * @author Sean A. Irvine
 */
public class A001108 implements Sequence {

  private Z mA = Z.EIGHT;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mB.multiply(6).add(2).subtract(mA);
    mA = mB;
    mB = t;
    return t;
  }
}

