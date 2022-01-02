package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053616 Pyramidal sequence: distance to nearest triangular number.
 * @author Sean A. Irvine
 */
public class A053616 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final long s = LongUtils.sqrt(2 * ++mN);
    return Z.valueOf(Math.abs(Math.min(mN - s * (s + 1) / 2, (s + 1) * (s + 2) / 2 - mN)));
  }
}
