package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059507 Transform of A059502 applied to sequence <code>4,5,6,</code>...
 * @author Sean A. Irvine
 */
public class A059507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059507() {
    super(new long[] {-1, 6, -11, 6}, new long[] {4, 9, 24, 66});
  }
}
