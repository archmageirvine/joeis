package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024490.
 * @author Sean A. Irvine
 */
public class A024490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024490() {
    super(new long[] {1, 0, -1, 2}, new long[] {1, 2, 3, 4});
  }
}
