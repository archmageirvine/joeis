package irvine.oeis.a194;

import irvine.oeis.LinearRecurrence;

/**
 * A194268 <code>8*n^2 + 7*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A194268 extends LinearRecurrence {

  /** Construct the sequence. */
  public A194268() {
    super(new long[] {1, -3, 3}, new long[] {1, 16, 47});
  }
}
