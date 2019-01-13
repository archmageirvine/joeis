package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116404.
 * @author Sean A. Irvine
 */
public class A116404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116404() {
    super(new long[] {1, 2, 0, 2}, new long[] {1, 1, 2, 6});
  }
}
