package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010792.
 * @author Sean A. Irvine
 */
public class A010792 implements Sequence {

  private long mN = 2;
  private Z mF0 = Z.ONE;
  private Z mF1 = Z.ONE;
  private Z mF2 = Z.TWO;

  @Override
  public Z next() {
    final Z r = mF0;
    mF0 = mF1;
    mF1 = mF2;
    mF2 = mF2.multiply(++mN);
    return r.multiply(mF2).divide(6);
  }
}
