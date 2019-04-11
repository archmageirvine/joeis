package irvine.oeis.a110;

import irvine.oeis.LinearRecurrence;

/**
 * A110035 Row sums of an unsigned characteristic triangle for the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A110035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A110035() {
    super(new long[] {1, -3, 0, 3}, new long[] {1, 2, 5, 12});
  }
}
