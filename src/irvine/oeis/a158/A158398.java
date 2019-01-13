package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158398.
 * @author Sean A. Irvine
 */
public class A158398 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158398() {
    super(new long[] {1, -3, 3}, new long[] {782, 3132, 7050});
  }
}
