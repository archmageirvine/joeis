package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077880.
 * @author Sean A. Irvine
 */
public class A077880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077880() {
    super(new long[] {1, -3, 2, 1}, new long[] {1, 1, 3, 2});
  }
}
