package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074742.
 * @author Sean A. Irvine
 */
public class A074742 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074742() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 3, 7, 15});
  }
}
