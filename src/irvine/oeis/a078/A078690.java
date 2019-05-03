package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078690 Continued fraction expansion of <code>e^(2/5)</code>.
 * @author Sean A. Irvine
 */
public class A078690 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078690() {
    super(new long[] {-1, 0, 0, 0, 0, 2, 0, 0, 0, 0}, new long[] {1, 2, 30, 12, 1, 1, 17, 90, 27, 1});
  }
}
