package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290987.
 * @author Sean A. Irvine
 */
public class A290987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290987() {
    super(new long[] {1, -3, 3, 1, -5, 4}, new long[] {1, 2, 4, 8, 16, 32});
  }
}
