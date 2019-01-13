package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168203.
 * @author Sean A. Irvine
 */
public class A168203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168203() {
    super(new long[] {-1, 1, 1}, new long[] {0, 9, 4});
  }
}
