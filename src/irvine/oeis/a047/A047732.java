package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047732 First differences are <code>A005563</code>.
 * @author Sean A. Irvine
 */
public class A047732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047732() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 12, 27});
  }
}
