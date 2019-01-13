package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289224.
 * @author Sean A. Irvine
 */
public class A289224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289224() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 4, 82, 670, 3028, 9780, 25574});
  }
}
