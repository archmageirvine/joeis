package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161713.
 * @author Sean A. Irvine
 */
public class A161713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161713() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 2, 4, 7, 14, 28});
  }
}
