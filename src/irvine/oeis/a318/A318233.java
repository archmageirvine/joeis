package irvine.oeis.a318;

import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;
import irvine.util.Permutation;

/**
 * A318233 F_n.
 * @author Sean A. Irvine
 */
public class A318233 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A318233() {
    super(1, 2);
  }

  @Override
  protected long count(final int[] p) {
    final int e = Permutation.excedance(p);
    return (e & 1) == 0 ? -1 : 1;
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (p.length < 1) {
      return true;
    }
    final int k = pos - 1;
    final int pk = p[k];
    if (pk == k) {
      return false; // fixed point
    }
    // Check 123-avoiding
    for (int j = 1; j < k; ++j) {
      if (p[j] < pk) {
        for (int i = 0; i < j; ++i) {
          if (p[i] < p[j]) {
            return false;
          }
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}
