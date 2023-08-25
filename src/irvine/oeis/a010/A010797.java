package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010797 a(n) = n! * (n+1)! * (n+2)! / (2! * 3!).
 * @author Sean A. Irvine
 */
public class A010797 extends Sequence1 {

  private long mN = 2;
  private Z mF0 = Z.ONE;
  private Z mF1 = Z.TWO;

  @Override
  public Z next() {
    final Z r = mF0;
    mF0 = mF1;
    mF1 = mF1.multiply(++mN);
    return r.multiply(mF0).multiply(mF1).divide(12);
  }
}
