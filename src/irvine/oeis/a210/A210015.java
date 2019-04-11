package irvine.oeis.a210;

import irvine.oeis.FiniteSequence;

/**
 * A210015 In base 4, numbers n which have 4 distinct digits, do not start with 0, and have property that the product (written in base 4) of any two adjacent digits is a substring of n.
 * @author Georg Fischer
 */
public class A210015 extends FiniteSequence {

  /** Construct the sequence. */
  public A210015() {
    super(1203, 1230, 1302, 2013, 2031, 2103, 2130, 3012, 3021, 3102, 3120);
  }
}
