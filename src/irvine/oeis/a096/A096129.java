package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096129.
 * @author Sean A. Irvine
 */
public class A096129 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096129() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 9, 73, 289, 801});
  }
}
