package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130781.
 * @author Sean A. Irvine
 */
public class A130781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130781() {
    super(new long[] {2, -3, 3}, new long[] {1, 1, 2});
  }
}
