package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095662.
 * @author Sean A. Irvine
 */
public class A095662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095662() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {3, 19, 70, 196, 462, 966, 1848});
  }
}
