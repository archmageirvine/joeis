package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188067.
 * @author Sean A. Irvine
 */
public class A188067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188067() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {0, 0, 1, 1, 6, 5, 18, 14});
  }
}
