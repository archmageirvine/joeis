package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253305.
 * @author Sean A. Irvine
 */
public class A253305 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253305() {
    super(new long[] {1, -1, -62, 62, 1}, new long[] {2, 29, 100, 1777, 6178});
  }
}
