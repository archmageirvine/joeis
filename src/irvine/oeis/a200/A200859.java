package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200859.
 * @author Sean A. Irvine
 */
public class A200859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200859() {
    super(new long[] {-15, -7, 7}, new long[] {-2, 1, 21});
  }
}
