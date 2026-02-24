package irvine.oeis.a065;
// manually 2025-04-06

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A065190 Self-inverse permutation of the positive integers: 1 is fixed, followed by an infinite number of adjacent transpositions (n n+1).
 * <code>a(1) = 1, a(n) = n+(-1)^n.</code>
 * @author Georg Fischer
 */
public class A065190 extends GeneratingFunctionSequence implements DirectSequence {

  /** Construct the sequence. */
  public A065190() {
    super(1, new long[] {0, 1, 2, -2, 1},
      new long[] {1, -1, -1, 1});
  }

  @Override
  public Z a(final Z n) {
    return n.isOne() ? Z.ONE : (n.testBit(0) ? Z.NEG_ONE : Z.ONE).add(n);
  }

  @Override
  public Z a(final int n) {
    return n == 1 ? Z.ONE : ((n & 1) == 1 ? Z.NEG_ONE : Z.ONE).add(n);
  }

}
