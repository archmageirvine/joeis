package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130727.
 * @author Sean A. Irvine
 */
public class A130727 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130727() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 2, 3});
  }
}
