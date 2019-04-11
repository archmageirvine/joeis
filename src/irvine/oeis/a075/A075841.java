package irvine.oeis.a075;

import irvine.oeis.LinearRecurrence;

/**
 * A075841 Numbers k such that <code>2*k^2 - 9</code> is a square.
 * @author Sean A. Irvine
 */
public class A075841 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075841() {
    super(new long[] {-1, 6}, new long[] {3, 15});
  }
}
