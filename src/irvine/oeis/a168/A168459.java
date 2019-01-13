package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168459.
 * @author Sean A. Irvine
 */
public class A168459 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168459() {
    super(new long[] {-1, 1, 1}, new long[] {1, 11, 11});
  }
}
