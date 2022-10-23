package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010794 a(n) = n!*(n+5)!/5!.
 * @author Sean A. Irvine
 */
public class A010794 extends Sequence0 {

  private long mN = 4;
  private Z mF0 = Z.ONE;
  private Z mF1 = Z.ONE;
  private Z mF2 = Z.TWO;
  private Z mF3 = Z.SIX;
  private Z mF4 = Z.valueOf(24);

  @Override
  public Z next() {
    final Z r = mF0;
    mF0 = mF1;
    mF1 = mF2;
    mF2 = mF3;
    mF3 = mF4;
    mF4 = mF4.multiply(++mN);
    return r.multiply(mF4).divide(120);
  }
}
