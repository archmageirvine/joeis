package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047339.
 * @author Sean A. Irvine
 */
public class A047339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047339() {
    super(new long[] {-1, 1, 0, 1}, new long[] {2, 3, 4, 9});
  }
}
