package irvine.oeis.a188;

import irvine.oeis.LinearRecurrence;

/**
 * A188134.
 * @author Sean A. Irvine
 */
public class A188134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A188134() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 4, 2, 12, 1, 20, 6, 28});
  }
}
