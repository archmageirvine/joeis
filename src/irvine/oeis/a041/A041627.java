package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041627 Denominators of continued fraction convergents to <code>sqrt(332)</code>.
 * @author Sean A. Irvine
 */
public class A041627 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041627() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 26894, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 5, 9, 77, 86, 163, 738, 26731, 107662, 134393, 242055, 2070833, 2312888, 4383721, 19847772});
  }
}
