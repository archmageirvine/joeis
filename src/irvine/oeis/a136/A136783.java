package irvine.oeis.a136;

import irvine.oeis.LinearRecurrence;

/**
 * A136783 Number of multiplex juggling sequences of length n, base state <code>&lt;3&gt;</code> and hand capacity 3.
 * @author Sean A. Irvine
 */
public class A136783 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136783() {
    super(new long[] {20, -27, 10}, new long[] {1, 4, 20});
  }
}
