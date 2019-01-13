package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237714.
 * @author Sean A. Irvine
 */
public class A237714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237714() {
    super(new long[] {2, 0, 0, 1, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
