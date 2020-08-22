package irvine.oeis.a073;

import irvine.oeis.LinearRecurrence;

/**
 * A073760 Integers m such that A073758(m) = 4.
 * @author Sean A. Irvine
 */
public class A073760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073760() {
    super(new long[] {-1, 2}, new long[] {6, 10});
  }
}
