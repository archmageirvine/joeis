package irvine.oeis.a339;

import irvine.oeis.triangle.RowSumSequence;

/**
 * A339283 Number of unoriented series-parallel networks with n integer valued elements spanning an initial interval of positive integers.
 * @author Gregory Morse
 */
public class A339283 extends RowSumSequence {
  /** Construct the sequence. */
  public A339283() {
    super(1, new A339282());
  }
}
