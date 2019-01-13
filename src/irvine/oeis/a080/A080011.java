package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080011.
 * @author Sean A. Irvine
 */
public class A080011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080011() {
    super(new long[] {-1, -1, 1, 0, -1, 3, 2, 1, 1, 1}, new long[] {1, 1, 1, 3, 7, 15, 29, 59, 126, 262});
  }
}
