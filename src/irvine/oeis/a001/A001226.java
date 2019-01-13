package irvine.oeis.a001;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001226.
 * @author Sean A. Irvine
 */
public class A001226 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Z.ONE.shiftLeft((int) LongUtils.phi(mN)).subtract(1).divide(mN);
  }
}
