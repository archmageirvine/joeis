package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010798 n!.(n+1)!.(n+2)!.(n+3)! / 2!.3!.4!.
 * @author Sean A. Irvine
 */
public class A010798 extends Sequence0 {

  private long mN = 3;
  private Z mF0 = Z.ONE;
  private Z mF1 = Z.TWO;
  private Z mF2 = Z.SIX;

  @Override
  public Z next() {
    final Z r = mF0;
    mF0 = mF1;
    mF1 = mF2;
    mF2 = mF2.multiply(++mN);
    return r.multiply(mF0).multiply(mF1).multiply(mF2).divide(288);
  }
}
