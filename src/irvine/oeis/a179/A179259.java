package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179259.
 * @author Sean A. Irvine
 */
public class A179259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179259() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 12, 52, 140});
  }
}
