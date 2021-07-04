package irvine.oeis.a048;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048761 Smallest square greater than or equal to n.
 * @author Sean A. Irvine
 */
public class A048761 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final long s = LongUtils.sqrt(++mN);
    return s * s == mN ? Z.valueOf(s * s) : Z.valueOf((s + 1) * (s + 1));
  }
}
