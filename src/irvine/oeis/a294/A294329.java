package irvine.oeis.a294;

import irvine.oeis.LinearRecurrence;

/**
 * A294329.
 * @author Sean A. Irvine
 */
public class A294329 extends LinearRecurrence {

  /** Construct the sequence. */
  public A294329() {
    super(new long[] {100, -120, 21}, new long[] {0, 16, 256});
  }
}
