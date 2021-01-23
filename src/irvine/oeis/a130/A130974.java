package irvine.oeis.a130;

import irvine.oeis.LinearRecurrence;

/**
 * A130974 Period 6: repeat [1, 1, 1, 3, 3, 3].
 * @author Sean A. Irvine
 */
public class A130974 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130974() {
    super(new long[] {1, -1, 0, 1}, new long[] {1, 1, 1, 3});
  }
}
