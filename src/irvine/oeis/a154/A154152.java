package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154152.
 * @author Sean A. Irvine
 */
public class A154152 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154152() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {4, 10, 37, 67, 220});
  }
}
