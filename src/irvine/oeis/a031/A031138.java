package irvine.oeis.a031;

import irvine.oeis.LinearRecurrence;

/**
 * A031138.
 * @author Sean A. Irvine
 */
public class A031138 extends LinearRecurrence {

  /** Construct the sequence. */
  public A031138() {
    super(new long[] {1, -11, 11}, new long[] {1, 13, 133});
  }
}
