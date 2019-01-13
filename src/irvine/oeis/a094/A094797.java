package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094797.
 * @author Sean A. Irvine
 */
public class A094797 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094797() {
    super(new long[] {100, -120, 21}, new long[] {1, 2, 21});
  }
}
