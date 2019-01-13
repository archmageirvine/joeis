package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094625.
 * @author Sean A. Irvine
 */
public class A094625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094625() {
    super(new long[] {-10, 0, 11, 0}, new long[] {0, 2, 22, 33});
  }
}
