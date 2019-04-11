package irvine.oeis.a109;

import irvine.oeis.FiniteSequence;

/**
 * A109552 <code>a(n) = floor(4076/(10-n)^2)</code>.
 * @author Georg Fischer
 */
public class A109552 extends FiniteSequence {

  /** Construct the sequence. */
  public A109552() {
    super(50, 63, 83, 113, 163, 254, 452, 1019, 4076);
  }
}
