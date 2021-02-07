package irvine.oeis.a336;
// manually

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A336483 Floor(n/10) + (5 times last digit of n).
 * @author Georg Fischer
 */
public class A336483 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A336483() {
    super(0, "[0, 5, 5, 5, 5, 5, 5, 5, 5, 5,-44]", "[1,-1, 0, 0, 0, 0, 0, 0, 0, 0,-1, 1]");
  }
}
