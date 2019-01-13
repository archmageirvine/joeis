package irvine.oeis.a011;

import irvine.oeis.LinearRecurrence;

/**
 * A011542.
 * @author Sean A. Irvine
 */
public class A011542 extends LinearRecurrence {

  /** Construct the sequence. */
  public A011542() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
      new long[] {0, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6, 3, 4, 5, 6, 7, 3, 4, 5, 6, 7, 1}
    );
  }
}
