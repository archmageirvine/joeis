package irvine.oeis.a000;
// manually 2026-08-10/lambdan at 2026-08-10 11:38

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000788 Total number of 1's in binary expansions of 0, ..., n.
 * @author Sean A. Irvine
 */
public class A000788 extends Sequence0 implements DirectSequence {

  private Z mS = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    mS = mS.add(Long.bitCount(++mN));
    return mS;
  }

  @Override
  public Z a(final Z n) {
    return a(n.longValueExact());
  }

  @Override
  public Z a(final long n) {
    return Integers.SINGLETON.sum(0, n, k -> Z.valueOf(Long.bitCount(k)));
  }
}
