package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151984.
 * @author Sean A. Irvine
 */
public class A151984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151984() {
    super(new long[] {-1, 1, 1}, new long[] {0, 1, 64});
  }
}
