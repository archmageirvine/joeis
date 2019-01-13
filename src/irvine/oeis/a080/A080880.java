package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080880.
 * @author Sean A. Irvine
 */
public class A080880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080880() {
    super(new long[] {-4, 0, 5, 0}, new long[] {1, 2, 2, 5});
  }
}
