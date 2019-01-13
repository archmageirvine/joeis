package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158382.
 * @author Sean A. Irvine
 */
public class A158382 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158382() {
    super(new long[] {1, -3, 3}, new long[] {627, 2504, 5631});
  }
}
