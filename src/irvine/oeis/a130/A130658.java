package irvine.oeis.a130;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A130658 Period 4: repeat [1, 1, 2, 2].
 * @author Sean A. Irvine
 */
public class A130658 extends LinearRecurrence {

  /** Construct the sequence. */
  public A130658() {
    super(new long[] {1, -1, 1}, new long[] {1, 1, 2});
  }
}
