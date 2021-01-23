package irvine.oeis.a146;

import irvine.oeis.LinearRecurrence;

/**
 * A146989 Periodic sequence with period {15,2,1,13,1}.
 * @author Sean A. Irvine
 */
public class A146989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A146989() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {15, 2, 1, 13, 1});
  }
}
