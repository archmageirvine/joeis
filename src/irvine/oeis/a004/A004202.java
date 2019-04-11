package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004202 Skip <code>1,</code> take <code>1,</code> skip <code>2,</code> take <code>2,</code> skip <code>3,</code> take <code>3,</code> etc.
 * @author Sean A. Irvine
 */
public class A004202 implements Sequence {

  private Z mA = Z.ZERO;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mA = mA.add(++mN);
      mM = mN;
    }
    mA = mA.add(1);
    return mA;
  }
}
