package irvine.oeis.a084;

import irvine.oeis.LinearRecurrence;

/**
 * A084479.
 * @author Sean A. Irvine
 */
public class A084479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A084479() {
    super(new long[] {20, 40, 31, 2}, new long[] {72, 384, 3360, 21504});
  }
}
