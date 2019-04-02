package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092966 Number of interior balls in a truncated tetrahedral arrangement.
 * @author Sean A. Irvine
 */
public class A092966 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092966() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 10, 52, 149});
  }
}
