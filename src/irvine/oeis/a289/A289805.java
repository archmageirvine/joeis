package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289805 p-INVERT of A103889, where p(S) = 1 - S - S^2.
 * @author Sean A. Irvine
 */
public class A289805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289805() {
    super(new long[] {1, -2, 8, -8, 2, 4}, new long[] {2, 9, 36, 153, 624, 2584});
  }
}
