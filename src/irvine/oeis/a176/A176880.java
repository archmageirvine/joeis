package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176880.
 * @author Sean A. Irvine
 */
public class A176880 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176880() {
    super(new long[] {-2, 2, -1, 3}, new long[] {1, 3, 8, 23});
  }
}
