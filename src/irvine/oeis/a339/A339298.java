package irvine.oeis.a339;

import irvine.oeis.triangle.RowSumSequence;

/**
 * A339298 Number of oriented series-parallel networks with n integer valued elements spanning an initial interval of positive integers and without multiple unit elements in parallel.
 * @author Gregory Morse
 */
public class A339298 extends RowSumSequence {
  /** Construct the sequence. */
  public A339298() {
    super(1, new A339297());
  }
}
