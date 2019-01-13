package irvine.oeis.a224;

import irvine.oeis.LinearRecurrence;

/**
 * A224227.
 * @author Sean A. Irvine
 */
public class A224227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A224227() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {0, 0, 0, 1, 2, 7});
  }
}
