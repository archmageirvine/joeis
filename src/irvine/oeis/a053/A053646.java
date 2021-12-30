package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053646 Distance to nearest power of 2.
 * @author Georg Fischer
 */
public class A053646 implements Sequence {

  protected long mN = 0L;

  @Override
  public Z next() {
    ++mN;
    final long hb = Long.highestOneBit(mN);
    final long distlo = mN - hb;
    final long disthi = (hb << 1) - mN;
    return Z.valueOf(Math.min(distlo, disthi));
  }
}
