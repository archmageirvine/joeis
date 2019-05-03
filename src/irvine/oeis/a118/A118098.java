package irvine.oeis.a118;

import irvine.oeis.FiniteSequence;

/**
 * A118098 Numbers that require three strokes when written in Roman numerals <code>(excluding serifs)</code>. III IV VI IX XI LI XC CII CV CX CL.
 * @author Georg Fischer
 */
public class A118098 extends FiniteSequence {

  /** Construct the sequence. */
  public A118098() {
    super(3, 4, 6, 9, 11, 51, 90, 102, 105, 110, 150, 201, 300, 400, 501, 600);
  }
}
