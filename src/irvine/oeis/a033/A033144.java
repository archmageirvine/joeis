package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033144.
 * @author Sean A. Irvine
 */
public class A033144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033144() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 8, 64, 513});
  }
}
