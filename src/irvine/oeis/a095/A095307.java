package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095307.
 * @author Sean A. Irvine
 */
public class A095307 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095307() {
    super(new long[] {-2, -3, 4, 1}, new long[] {1, 0, 4, 1});
  }
}
