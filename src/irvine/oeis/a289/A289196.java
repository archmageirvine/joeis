package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.a360.A360875;

/**
 * A289196 Number of connected dominating sets in the n X n rook graph.
 * @author Gregory Morse
 */
public class A289196 extends A360875 {
  private int mN = 0;

  @Override
  public Z next() {
    return term(++mN, mN);
  }
}
