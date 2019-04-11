package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130782 Periodic sequence with period <code>1, 1, 2, 1, 1</code>.
 * @author Sean A. Irvine
 */
public class A130782 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130782() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 1, 2, 1, 1});
  }
}
