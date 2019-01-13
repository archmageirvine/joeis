package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130608.
 * @author Sean A. Irvine
 */
public class A130608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130608() {
    super(new long[] {1, -1, 0, -6, 6, 0, 1}, new long[] {0, 28, 385, 501, 645, 2668, 3340});
  }
}
