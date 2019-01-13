package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097169.
 * @author Sean A. Irvine
 */
public class A097169 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097169() {
    super(new long[] {90, -90, -19, 19, 1}, new long[] {1, 4, 13, 52, 133});
  }
}
