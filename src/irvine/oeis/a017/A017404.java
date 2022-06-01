package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017404 (11n+1)^4.
 * @author Sean A. Irvine
 */
public class A017404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017404() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 20736, 279841, 1336336, 4100625});
  }
}
