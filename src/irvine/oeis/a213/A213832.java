package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213832.
 * @author Sean A. Irvine
 */
public class A213832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213832() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 19, 78, 202});
  }
}
