package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221174.
 * @author Sean A. Irvine
 */
public class A221174 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221174() {
    super(new long[] {1, 2}, new long[] {-4, 5});
  }
}
