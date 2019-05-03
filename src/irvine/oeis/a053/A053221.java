package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053221 Row sums of triangle <code>A053218</code>.
 * @author Sean A. Irvine
 */
public class A053221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053221() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 5, 16, 43});
  }
}
