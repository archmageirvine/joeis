package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010790.
 * @author Sean A. Irvine
 */
public class A010790 implements Sequence {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z r = mF;
    mF = mF.multiply(++mN);
    return r.multiply(mF);
  }
}
