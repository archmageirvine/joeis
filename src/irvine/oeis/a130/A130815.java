package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130815 Period 6: repeat [1, 5, 4, -1, -5, -4].
 * @author Sean A. Irvine
 */
public class A130815 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130815() {
    super(new long[] {-1, 1}, new long[] {1, 5});
  }
}
