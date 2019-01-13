package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118286.
 * @author Sean A. Irvine
 */
public class A118286 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118286() {
    super(new long[] {-1, 2, -2, 2}, new long[] {2, 4, 8, 12});
  }
}
