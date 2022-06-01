package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074877 Number of function calls required to compute ack(3,n), where ack denotes the Ackermann function.
 * @author Sean A. Irvine
 */
public class A074877 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074877() {
    super(new long[] {-8, 22, -21, 8}, new long[] {15, 106, 541, 2432});
  }
}
