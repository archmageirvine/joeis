package irvine.oeis.a144;

import irvine.oeis.LinearRecurrence;

/**
 * A144863.
 * @author Sean A. Irvine
 */
public class A144863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A144863() {
    super(new long[] {-10000, 10001}, new long[] {1, 10101});
  }
}
