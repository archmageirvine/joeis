package irvine.oeis.a378;

import irvine.math.z.Z;

/**
 * A378936 Number of minimal edge cuts in the n X n rook graph.
 * @author Gregory Morse
 */
public class A378936 extends A378935 {
  private int mN = 0;

  @Override
  public Z next() {
    return term(++mN, mN);
  }
}
