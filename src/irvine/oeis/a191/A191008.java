package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191008.
 * @author Sean A. Irvine
 */
public class A191008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191008() {
    super(new long[] {-9, -3, 5}, new long[] {1, 5, 22});
  }
}
