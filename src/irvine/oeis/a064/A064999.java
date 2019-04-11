package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064999 Partial sums of sequence (essentially A002378): <code>1, 2, 6, 12, 20, 30, 42, 56, 72, 90, ..</code>.
 * @author Sean A. Irvine
 */
public class A064999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064999() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 3, 9, 21});
  }
}
