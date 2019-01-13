package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004275.
 * @author Sean A. Irvine
 */
public class A004275 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += mN < 2 ? 1 : 2;
    return Z.valueOf(mN);
  }
}
