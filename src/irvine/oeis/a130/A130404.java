package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130404.
 * @author Sean A. Irvine
 */
public class A130404 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130404() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {1, 2, 3, 6, 7});
  }
}
