package irvine.oeis.a096;

import irvine.oeis.LinearRecurrence;

/**
 * A096382.
 * @author Sean A. Irvine
 */
public class A096382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A096382() {
    super(new long[] {-1, 4, -6, 4}, new long[] {30, 96, 210, 384});
  }
}
