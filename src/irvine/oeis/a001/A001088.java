package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001088.
 * @author Sean A. Irvine
 */
public class A001088 implements Sequence {

  private Z mP = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    mP = mP.multiply(LongUtils.phi(++mN));
    return mP;
  }
}

