package irvine.oeis.a339;

import irvine.oeis.triangle.RowSumSequence;

/**
 * A339229 Number of oriented series-parallel networks with n integer valued elements spanning an initial interval of positive integers.
 * @author Gregory Morse
 */
public class A339229 extends RowSumSequence {
  /** Construct the sequence. */
  public A339229() {
    super(1, new A339228());
  }
}
