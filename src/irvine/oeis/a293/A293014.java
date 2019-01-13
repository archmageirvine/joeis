package irvine.oeis.a293;

import irvine.oeis.LinearRecurrence;

/**
 * A293014.
 * @author Sean A. Irvine
 */
public class A293014 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293014() {
    super(new long[] {1, 1, -1, 1, 1}, new long[] {0, 0, 0, 0, 1});
  }
}
