package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069132 Centered 19-gonal numbers.
 * @author Sean A. Irvine
 */
public class A069132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069132() {
    super(new long[] {1, -3, 3}, new long[] {1, 20, 58});
  }
}
