package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130151.
 * @author Sean A. Irvine
 */
public class A130151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130151() {
    super(new long[] {-1, 0, 0}, new long[] {1, 1, 1});
  }
}
