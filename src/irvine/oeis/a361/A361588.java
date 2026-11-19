package irvine.oeis.a361;

import irvine.math.z.Z;

/**
 * A361588 Triangle read by rows: T(n,k) is the number of digraphs on n unlabeled nodes with k strongly connected components and without isolated nodes.
 * @author Gregory Morse
 */
public class A361588 extends A361582 {
  @Override
  protected Z compute(final int n, final int k) {
    final Z count = super.compute(n, k);
    // Deleting one isolate removes one singleton component.
    return k == 0 ? count : count.subtract(super.compute(n - 1, k - 1));
  }
}
