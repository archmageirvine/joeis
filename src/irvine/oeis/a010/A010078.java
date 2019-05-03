package irvine.oeis.a010;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010078 Shortest representation of <code>-n</code> in <code>2's-complement</code> format.
 * @author Sean A. Irvine
 */
public class A010078 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Z.valueOf((1 << (LongUtils.lg(mN - 1) + 2)) - mN);
  }
}

