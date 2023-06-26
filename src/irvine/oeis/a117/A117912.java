package irvine.oeis.a117;

import irvine.oeis.FiniteSequence;

/**
 * A117912 Lynch-Bell numbers whose digits are all even.
 * @author Georg Fischer
 */
public class A117912 extends FiniteSequence {

  /** Construct the sequence. */
  public A117912() {
    super(1, FINITE, 2, 4, 6, 8, 24, 48, 248, 264, 624, 648, 824, 864);
  }
}
