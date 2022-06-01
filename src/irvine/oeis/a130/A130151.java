package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130151 Period 6: repeat [1, 1, 1, -1, -1, -1].
 * @author Sean A. Irvine
 */
public class A130151 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130151() {
    super(new long[] {-1, 0, 0}, new long[] {1, 1, 1});
  }
}
