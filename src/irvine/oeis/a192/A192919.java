package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192919.
 * @author Sean A. Irvine
 */
public class A192919 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192919() {
    super(new long[] {-1, 2, 2}, new long[] {3, 0, 8});
  }
}
