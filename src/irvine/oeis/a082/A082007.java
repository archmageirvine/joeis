package irvine.oeis.a082;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A082007 Triangle (an infinite binary tree) read by rows; see Comments lines for definition.
 * @author Sean A. Irvine
 */
public class A082007 extends CachedSequence {

  /** Construct the sequence. */
  public A082007() {
    super(0, Integer.class, (self, n) -> {
      if (n == 0) {
        return Z.ZERO;
      }
      final long y = 1L << LongUtils.log2(n + 1);
      final long col = 1L << (1L << LongUtils.log2(LongUtils.log2(y)));
      final long row = y / col;
      return Z.valueOf(col - 1).multiply((n + 1 - y) / row + 1).add(self.a(Z.valueOf(row + (n + 1) % row - 1)));
    });
  }
}
