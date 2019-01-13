package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007495.
 * @author Sean A. Irvine
 */
public class A007495 implements Sequence {

  private long mN = 0;

  private long josephus(final long k, final long n) {
    return k == 1 ? 0L : (josephus(k - 1, n) + n) % k;
  }

  @Override
  public Z next() {
    return Z.valueOf(josephus(++mN, mN) + 1);
  }
}

