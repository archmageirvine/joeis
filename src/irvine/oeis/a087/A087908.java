package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087908 Largest integer not expressible as a nonnegative linear combination of n and n^2 + 1.
 * @author Sean A. Irvine
 */
public class A087908 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087908() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, 3, 17, 47});
  }
}
