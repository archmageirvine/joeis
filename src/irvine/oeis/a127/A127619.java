package irvine.oeis.a127;

import irvine.oeis.LinearRecurrence;

/**
 * A127619.
 * @author Sean A. Irvine
 */
public class A127619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A127619() {
    super(new long[] {4, -12, -11, 6, 5}, new long[] {1, 1, 5, 22, 117});
  }
}
