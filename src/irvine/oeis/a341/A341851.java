package irvine.oeis.a341;

import irvine.math.z.Z;

/**
 * A341851 Number of maximum matchings in the 3 X n rook graph.
 * @author Gregory Morse
 */
public class A341851 extends A341850 {
  private int mN = -1;

  @Override
  public Z next() {
    return matchings(3, ++mN);
  }
}
