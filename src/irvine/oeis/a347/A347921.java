package irvine.oeis.a347;

import irvine.math.z.Z;
import irvine.oeis.a384.A384118;

/**
 * A347921 Number of minimal total dominating sets in the n X n rook graph.
 * @author Gregory Morse
 */
public class A347921 extends A384118 {
  private int mN = 0;

  /** Construct the sequence. */
  public A347921() {
    setOffset(1);
  }

  @Override
  public Z next() {
    return total(++mN, mN);
  }
}
