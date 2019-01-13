package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094028.
 * @author Sean A. Irvine
 */
public class A094028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094028() {
    super(new long[] {-100, 101}, new long[] {1, 101});
  }
}
