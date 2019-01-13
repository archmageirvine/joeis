package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174395.
 * @author Sean A. Irvine
 */
public class A174395 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174395() {
    super(new long[] {6, -5, -5, 5}, new long[] {0, 2, 10, 40});
  }
}
