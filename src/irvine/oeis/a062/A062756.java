package irvine.oeis.a062;
// manually 2025-11-28

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;


/**
 * A062756 Number of 1's in ternary (base-3) expansion of n.
 * @author Georg Fischer
 */
public class A062756 extends Sequence0 implements DirectSequence {

  protected int mN = -1;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Z.valueOf(ZUtils.digitCounts(n, 3)[1]);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(ZUtils.digitCounts(Z.valueOf(n), 3)[1]);
  }
}
