package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141025.
 * @author Sean A. Irvine
 */
public class A141025 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141025() {
    super(new long[] {2, -3, -1, 3}, new long[] {1, 1, 1, 5});
  }
}
