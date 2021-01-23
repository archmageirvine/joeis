package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001608 Perrin sequence (or Ondrej Such sequence): a(n) = a(n-2) + a(n-3) with a(0) = 3, a(1) = 0, a(2) = 2.
 * @author Sean A. Irvine
 */
public class A001608 implements Sequence {

  private Z mA = Z.TWO;
  private Z mB = Z.ONE;
  private Z mC = Z.NEG_ONE;

  @Override
  public Z next() {
    final Z t = mA.add(mB);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}
