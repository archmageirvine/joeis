package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056570 Third power of Fibonacci numbers <code>(A000045)</code>.
 * @author Sean A. Irvine
 */
public class A056570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056570() {
    super(new long[] {-1, -3, 6, 3}, new long[] {0, 1, 1, 8});
  }
}
