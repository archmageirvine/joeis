package irvine.oeis.a118;

import irvine.oeis.LinearRecurrence;

/**
 * A118057.
 * @author Sean A. Irvine
 */
public class A118057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A118057() {
    super(new long[] {1, -3, 3}, new long[] {1, 21, 57});
  }
}
