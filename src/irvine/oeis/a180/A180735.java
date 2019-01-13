package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180735.
 * @author Sean A. Irvine
 */
public class A180735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180735() {
    super(new long[] {-1, -1, 1}, new long[] {1, 1, -1});
  }
}
