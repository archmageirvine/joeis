package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020341.
 * @author Sean A. Irvine
 */
public class A020341 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020341() {
    super(new long[] {420, -179, 24}, new long[] {1, 24, 397});
  }
}
