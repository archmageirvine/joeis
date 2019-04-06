package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178356 Fibonacci numbers whose successive digits decrease by 1.
 * @author Georg Fischer
 */
public class A178356 extends FiniteSequence {

  /** Construct the sequence. */
  public A178356() {
    super(0, 1, 2, 3, 5, 8, 21, 987);
  }
}
