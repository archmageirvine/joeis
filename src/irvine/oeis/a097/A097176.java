package irvine.oeis.a097;

import irvine.oeis.LinearRecurrence;

/**
 * A097176.
 * @author Sean A. Irvine
 */
public class A097176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A097176() {
    super(new long[] {650, -650, -51, 51, 1}, new long[] {1, 6, 31, 186, 811});
  }
}
