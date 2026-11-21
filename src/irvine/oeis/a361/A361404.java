package irvine.oeis.a361;

import irvine.math.z.Z;
import irvine.oeis.a401.A401210;

/**
 * A361404 Triangle read by rows: T(n,k) is the number of graphs with loops on n unlabeled vertices with k loops.
 * @author Gregory Morse
 */
public class A361404 extends A401210 {
  @Override
  protected Z compute(final int n, final int k) {
    return colored(n, k, true, false);
  }
}
