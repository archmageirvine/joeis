package irvine.oeis.a122;
// manually fract1/lingf at 2024-02-27 12:08

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A122575 Expansion of -x*(1-x)/(1+14*x+x^2)^3.
 * @author Georg Fischer
 */
public class A122575 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A122575() {
    super(0, "[0, -1, 1]", "[1, 42, 591, 2828, 591, 42, 1]");
    setOffset(1);
  }
}
