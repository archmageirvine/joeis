package irvine.oeis.a065;
// manually cordrec at 2022-06-08 21:34

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A065410 Number of labeled, rooted, binary trees with internal nodes labeled from {1, ...,n} and leaves labeled from {0,1} such that for any path from the root to a leaf, the internal nodes receive distinct labels. In other words, the number of decision trees on n Boolean variables.
 * @author Georg Fischer
 */
public class A065410 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A065410() {
    super(0, 1, 0, 2);
  }

  @Override
  protected Z compute(final int n) {
    return Z.valueOf(2).add((a(n - 1)).square().multiply(n));
  }
}
