package irvine.oeis.a370;

import irvine.math.z.Z;

/**
 * A370613 Total number of acyclic orientations in all complete multipartite graphs K_lambda, where lambda ranges over all partitions of n into distinct parts.
 * @author Gregory Morse
 */
public class A370613 extends A370614 {
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
