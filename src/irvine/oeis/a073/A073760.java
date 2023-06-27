package irvine.oeis.a073;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A073760 Integers m such that A073758(m) = 4.
 * @author Sean A. Irvine
 */
public class A073760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073760() {
    super(1, new long[] {-1, 2}, new long[] {6, 10});
  }
}
