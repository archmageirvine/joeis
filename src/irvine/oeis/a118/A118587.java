package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118587.
 * @author Sean A. Irvine
 */
public class A118587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118587() {
    super(new long[] {-1, 4, -6, 4}, new long[] {17, 43, 47, 131});
  }
}
