package irvine.oeis.a291;

import irvine.math.z.Z;

/**
 * A291104 Number of maximal irredundant sets in the n X n rook graph.
 * @author Gregory Morse
 */
public class A291104 extends A291543 {
  private int mN = 0;

  @Override
  public Z next() {
    return term(++mN, mN);
  }
}
