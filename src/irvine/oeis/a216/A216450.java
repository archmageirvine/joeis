package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216450.
 * @author Sean A. Irvine
 */
public class A216450 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216450() {
    super(new long[] {1, -3, -10}, new long[] {3, -10, 94});
  }
}
