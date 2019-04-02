package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075911 Third column of triangle A075500.
 * @author Sean A. Irvine
 */
public class A075911 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075911() {
    super(new long[] {750, -275, 30}, new long[] {1, 30, 625});
  }
}
