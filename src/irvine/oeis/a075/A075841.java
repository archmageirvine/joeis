package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075841 Numbers k such that 2*k^2 - 9 is a square.
 * @author Sean A. Irvine
 */
public class A075841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075841() {
    super(new long[] {-1, 6}, new long[] {3, 15});
  }
}
