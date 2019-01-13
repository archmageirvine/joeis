package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158734.
 * @author Sean A. Irvine
 */
public class A158734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158734() {
    super(new long[] {1, -3, 3}, new long[] {1, 71, 281});
  }
}
