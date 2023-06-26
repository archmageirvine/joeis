package irvine.oeis.a306;

import irvine.oeis.FiniteSequence;

/**
 * A306621 Highly abundant numbers that are powerful.
 * @author Georg Fischer
 */
public class A306621 extends FiniteSequence {

  /** Construct the sequence. */
  public A306621() {
    super(1, FINITE, 1, 4, 8, 16, 36, 72, 108, 144, 216, 288, 1800, 3600, 7200);
  }
}
