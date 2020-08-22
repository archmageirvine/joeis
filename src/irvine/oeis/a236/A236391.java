package irvine.oeis.a236;

import irvine.oeis.FiniteSequence;

/**
 * A236391 Positive numbers n such that 100*n^2/(100+n^2) are integers.
 * @author Georg Fischer
 */
public class A236391 extends FiniteSequence {

  /** Construct the sequence. */
  public A236391() {
    super(5, 10, 20, 30, 70);
  }
}
