package irvine.oeis.a021;

import irvine.oeis.LinearRecurrence;

/**
 * A021944.
 * @author Sean A. Irvine
 */
public class A021944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A021944() {
    super(new long[] {-384, 560, -200, 25}, new long[] {1, 25, 425, 6185});
  }
}
