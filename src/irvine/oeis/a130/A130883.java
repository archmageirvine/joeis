package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130883.
 * @author Sean A. Irvine
 */
public class A130883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130883() {
    super(new long[] {1, -3, 3}, new long[] {1, 2, 7});
  }
}
