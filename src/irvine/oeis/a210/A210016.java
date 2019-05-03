package irvine.oeis.a210;

import irvine.oeis.FiniteSequence;

/**
 * A210016 In base 5, numbers n which have 5 distinct digits, do not start with 0, and have property that the product (written in base <code>5)</code> of any two adjacent digits is a substring of n.
 * @author Georg Fischer
 */
public class A210016 extends FiniteSequence {

  /** Construct the sequence. */
  public A210016() {
    super(13024, 13042, 20314, 20413, 21304, 21403, 24013, 24130, 30214, 30412, 31204, 31402, 40213, 40312, 41203, 41302, 42013, 42130);
  }
}
