package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180118.
 * @author Sean A. Irvine
 */
public class A180118 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180118() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 6, 18, 38});
  }
}
