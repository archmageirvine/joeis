package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094125 <code>a(n) = 3*2^n + 2*3^n</code>.
 * @author Sean A. Irvine
 */
public class A094125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094125() {
    super(new long[] {-6, 5}, new long[] {5, 12});
  }
}
