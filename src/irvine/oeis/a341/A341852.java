package irvine.oeis.a341;

import irvine.math.z.Z;

/**
 * A341852 Number of perfect matchings in the 4 X n rook graph.
 * @author Gregory Morse
 */
public class A341852 extends A341850 {
  private int mN = -1;

  @Override
  public Z next() {
    return matchings(4, ++mN);
  }
}
