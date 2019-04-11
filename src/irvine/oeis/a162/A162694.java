package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162694 Strictly positive numbers n such that <code>36*n/(36+n)</code> are integers.
 * @author Georg Fischer
 */
public class A162694 extends FiniteSequence {

  /** Construct the sequence. */
  public A162694() {
    super(12, 18, 36, 45, 72, 108, 126, 180, 288, 396, 612, 1260);
  }
}
