package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001283.
 * @author Sean A. Irvine
 */
public class A001283 implements Sequence {

  private long mN = 1;
  private long mP = 0;

  @Override
  public Z next() {
    if (++mP >= mN) {
      ++mN;
      mP = 1;
    }
    return Z.valueOf(mN).multiply(mN + mP);
  }

}
