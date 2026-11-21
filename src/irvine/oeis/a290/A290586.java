package irvine.oeis.a290;

import irvine.math.z.Z;

/**
 * A290586 Number of irredundant sets in the n X n rook graph.
 * @author Gregory Morse
 */
public class A290586 extends A290818 {
  private int mN = 0;

  @Override
  public Z next() {
    return term(++mN, mN);
  }
}
