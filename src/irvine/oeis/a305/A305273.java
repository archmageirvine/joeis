package irvine.oeis.a305;

import irvine.oeis.FiniteSequence;

/**
 * A305273 Numbers k in <code>A048981</code> for which the ring <code>Z[sqrt(k)]</code> is not a UFD.
 * @author Georg Fischer
 */
public class A305273 extends FiniteSequence {

  /** Construct the sequence. */
  public A305273() {
    super(-11, -7, -3, 5, 13, 17, 21, 29, 33, 37, 41, 57, 73);
  }
}
