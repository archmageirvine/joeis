package irvine.oeis.a372;

import irvine.math.z.Z;

/**
 * A372395 Total number of acyclic orientations in all complete multipartite graphs K_lambda, where lambda ranges over all partitions of n.
 * @author Gregory Morse
 */
public class A372395 extends A372396 {
  private int mN = -1;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z v : row(++mN)) {
      sum = sum.add(v);
    }
    return sum;
  }
}
