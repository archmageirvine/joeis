package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168414.
 * @author Sean A. Irvine
 */
public class A168414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168414() {
    super(new long[] {-1, 1, 1}, new long[] {6, 6, 15});
  }
}
