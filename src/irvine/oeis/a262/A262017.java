package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262017.
 * @author Sean A. Irvine
 */
public class A262017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262017() {
    super(new long[] {1, -23, 23}, new long[] {61, 1381, 30361});
  }
}
