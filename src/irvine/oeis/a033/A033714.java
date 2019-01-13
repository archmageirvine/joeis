package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033714.
 * @author Sean A. Irvine
 */
public class A033714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033714() {
    super(new long[] {100, -120, 21}, new long[] {1, 10, 190});
  }
}
