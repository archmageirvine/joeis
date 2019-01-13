package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289230.
 * @author Sean A. Irvine
 */
public class A289230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289230() {
    super(new long[] {1, -5, 9, -6, 0, 0, 0, 6, -9, 5}, new long[] {0, 2, 19, 127, 536, 1688, 4357, 9789, 19844, 37172});
  }
}
