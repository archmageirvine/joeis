package irvine.oeis.a391;

import irvine.math.z.Z;

/**
 * A391484 Array read by antidiagonals: T(n,k) is the number of nonequivalent series-parallel networks with longest path of at most n edges and largest cut set of at most k edges.
 * @author Gregory Morse
 */
public class A391484 extends A391485 {
  @Override
  protected Z t(final int n, final int k) {
    return parallel(n, k).add(parallel(k, n)).subtract(1);
  }
}
