package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.a341.A341850;

/**
 * A289197 Number of maximum matchings in the n X n rook graph.
 * @author Gregory Morse
 */
public class A289197 extends A341850 {
  private int mN = 0;

  /** Construct the sequence. */
  public A289197() {
    setOffset(1);
  }

  @Override
  public Z next() {
    return matchings(++mN, mN);
  }
}
