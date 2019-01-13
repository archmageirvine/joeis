package irvine.oeis.a005;

import irvine.oeis.LinearRecurrence;

/**
 * A005682.
 * @author Sean A. Irvine
 */
public class A005682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005682() {
    super(new long[] {-1, 0, -1, 0, 0, 2}, new long[] {1, 2, 4, 8, 15, 28});
  }
}

