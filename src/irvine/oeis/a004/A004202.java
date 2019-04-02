package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004202 Skip 1, take 1, skip 2, take 2, skip 3, take 3, etc.
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
