package irvine.oeis.a113;

import irvine.oeis.FiniteSequence;

/**
 * A113163 a(n) = (5 choose n) * (7 choose 5-n).
 * @author Georg Fischer
 */
public class A113163 extends FiniteSequence {

  /** Construct the sequence. */
  public A113163() {
    super(21, 175, 350, 210, 35, 1);
  }
}
