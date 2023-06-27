package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274587 Values of n such that 2*n-1 and 4*n-1 are both triangular numbers.
 * @author Sean A. Irvine
 */
public class A274587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274587() {
    super(1, new long[] {1, -35, 1189, -40391, 40391, -1189, 35}, new long[] {1, 23, 176, 5968, 888778, 30192278, 233944673});
  }
}
