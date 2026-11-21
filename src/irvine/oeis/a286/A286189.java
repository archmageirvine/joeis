package irvine.oeis.a286;

import irvine.math.z.Z;
import irvine.oeis.a360.A360873;

/**
 * A286189 Number of connected induced (non-null) subgraphs of the n X n rook graph.
 * @author Gregory Morse
 */
public class A286189 extends A360873 {
  private int mN = 0;

  @Override
  public Z next() {
    return term(++mN, mN);
  }
}
