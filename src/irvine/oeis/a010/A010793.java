package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010793 a(n) = n! (n+4)! / 4!.
 * @author Sean A. Irvine
 */
public class A010793 implements Sequence {

  private long mN = 3;
  private Z mF0 = Z.ONE;
  private Z mF1 = Z.ONE;
  private Z mF2 = Z.TWO;
  private Z mF3 = Z.SIX;

  @Override
  public Z next() {
    final Z r = mF0;
    mF0 = mF1;
    mF1 = mF2;
    mF2 = mF3;
    mF3 = mF3.multiply(++mN);
    return r.multiply(mF3).divide(24);
  }
}
