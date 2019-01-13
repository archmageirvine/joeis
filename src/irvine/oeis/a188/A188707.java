package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188707.
 * @author Sean A. Irvine
 */
public class A188707 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188707() {
    super(new long[] {-3, 5}, new long[] {5, 21});
  }
}
