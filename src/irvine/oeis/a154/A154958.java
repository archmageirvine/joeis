package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154958.
 * @author Sean A. Irvine
 */
public class A154958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154958() {
    super(new long[] {-1, 1, 1, -2, 1, 1}, new long[] {1, 1, 2, 1, 2, 1});
  }
}
