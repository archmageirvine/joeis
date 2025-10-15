package irvine.oeis.a035;

import irvine.oeis.InverseSequence;

/**
 * A035244 Smallest number with exactly n prime substrings.
 * @author Sean A. Irvine
 */
public class A035244 extends InverseSequence {

  /** Construct the sequence. */
  public A035244() {
    super(0, 0, new A035232(), 1);
  }
}

