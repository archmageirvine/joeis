package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A004065 Define predecessors of n, <code>P(n)</code>, to consist of numbers whose binary representation is obtained from that of n by replacing 10 with 01 or changing a final 1 to a 0; then <code>a(0)=1, a(n) =</code> Sum <code>a(P(n)), n&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A004065 extends MemorySequence {

  private static final int INITIAL_MASK = 3 << 30;
  private static final int INITIAL_MATCH = 1 << 31;

  @Override
  protected Z computeNext() {
    if (isEmpty()) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final int binary = size();
    for (int mask = INITIAL_MASK, match = INITIAL_MATCH; mask != 0; mask >>>= 1, match >>>= 1) {
      if ((binary & mask) == match) {
        final int p = binary ^ mask;
        sum = sum.add(get(p));
      }
    }
    return sum;
  }
}
