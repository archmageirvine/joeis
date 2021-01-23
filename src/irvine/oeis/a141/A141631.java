package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141631 3*n^2 - 4*n + 3.
 * @author Sean A. Irvine
 */
public class A141631 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141631() {
    super(new long[] {1, -3, 3}, new long[] {2, 7, 18});
  }
}
