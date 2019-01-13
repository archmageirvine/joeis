package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094027.
 * @author Sean A. Irvine
 */
public class A094027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094027() {
    super(new long[] {-100, 0, 101, 0}, new long[] {0, 1, 100, 101});
  }
}
