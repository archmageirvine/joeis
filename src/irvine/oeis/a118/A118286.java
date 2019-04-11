package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118286 Numbers n such that <code>n=0 (mod 4)</code> or <code>n=2 (mod 12)</code>.
 * @author Sean A. Irvine
 */
public class A118286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118286() {
    super(new long[] {-1, 2, -2, 2}, new long[] {2, 4, 8, 12});
  }
}
