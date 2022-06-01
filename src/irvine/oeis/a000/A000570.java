package irvine.oeis.a000;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A000570 Number of tournaments on n nodes determined by their score vectors.
 * @author Sean A. Irvine
 */
public class A000570 extends LinearRecurrence {

  /** Construct the sequence. */
  public A000570() {
    super(new long[] {1, 1, 1, 0, 1}, new long[] {1, 1, 2, 4, 7});
  }
}
