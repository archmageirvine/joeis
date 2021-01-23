package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001610 a(n) = a(n-1) + a(n-2) + 1, with a(0) = 0 and a(1) = 2.
 * @author Sean A. Irvine
 */
public class A001610 implements Sequence {

  private Z mA = Z.valueOf(-2);
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z t = mA.add(mB).add(1);
    mA = mB;
    mB = t;
    return t;
  }
}
