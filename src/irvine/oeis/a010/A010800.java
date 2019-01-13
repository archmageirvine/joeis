package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010800.
 * @author Sean A. Irvine
 */
public class A010800 implements Sequence {

  private long mN = 5;
  private Z mF0 = Z.ONE;
  private Z mF1 = Z.TWO;
  private Z mF2 = Z.SIX;
  private Z mF3 = Z.valueOf(24);
  private Z mF4 = Z.valueOf(120);

  @Override
  public Z next() {
    final Z r = mF0;
    mF0 = mF1;
    mF1 = mF2;
    mF2 = mF3;
    mF3 = mF4;
    mF4 = mF4.multiply(++mN);
    return r.multiply(mF0).multiply(mF1).multiply(mF2).multiply(mF3).multiply(mF4).divide(24883200);
  }
}
