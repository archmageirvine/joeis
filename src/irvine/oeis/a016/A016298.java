package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016298.
 * @author Sean A. Irvine
 */
public class A016298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016298() {
    super(new long[] {90, -73, 16}, new long[] {1, 16, 183});
  }
}
