package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130794 Periodic sequence with period <code>1,5,3</code>.
 * @author Sean A. Irvine
 */
public class A130794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130794() {
    super(new long[] {1, 0, 0}, new long[] {1, 5, 3});
  }
}
