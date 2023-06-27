package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213816 Tribonacci sequences A000073 and A001590 interleaved.
 * @author Sean A. Irvine
 */
public class A213816 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213816() {
    super(1, new long[] {1, 0, 1, 0, 1, 0}, new long[] {1, 1, 1, 2, 2, 3});
  }
}
