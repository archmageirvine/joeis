package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291675.
 * @author Sean A. Irvine
 */
public class A291675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291675() {
    super(new long[] {-2, -3, 2, 2}, new long[] {4, 14, 40, 96});
  }
}
