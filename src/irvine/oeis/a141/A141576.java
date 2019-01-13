package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141576.
 * @author Sean A. Irvine
 */
public class A141576 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141576() {
    super(new long[] {1, -2, 1}, new long[] {-1, 0, 1});
  }
}
