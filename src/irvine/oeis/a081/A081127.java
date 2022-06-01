package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081127 11th binomial transform of (0,1,0,0,0,0,0,......).
 * @author Sean A. Irvine
 */
public class A081127 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081127() {
    super(new long[] {-121, 22}, new long[] {0, 1});
  }
}
