package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004201 Accept one, reject one, accept two, reject two, ...
 * @author Sean A. Irvine
 */
public class A004201 implements Sequence {

  private Z mA = Z.ZERO;
  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM <= 0) {
      mA = mA.add(mN++);
      mM = mN;
    }
    mA = mA.add(1);
    return mA;
  }
}
