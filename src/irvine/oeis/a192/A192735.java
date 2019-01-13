package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192735.
 * @author Sean A. Irvine
 */
public class A192735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192735() {
    super(new long[] {-1, 2, -1, 2, -4, 2, -1, 2}, new long[] {1, 2, 6, 16, 30, 54, 91, 136});
  }
}
