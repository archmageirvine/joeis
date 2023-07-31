package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064866 Write numbers 1, then 1 up to 2^2, then 1 up to 3^2, then 1 up to 4^2 and so on.
 * @author Sean A. Irvine
 */
public class A064866 extends Sequence1 {

  private long mM = 0;
  private long mN = 1;
  private long mS = 1;

  @Override
  public Z next() {
    if (++mM > mS) {
      mS = ++mN * mN;
      mM = 1;
    }
    return Z.valueOf(mM);
  }
}

