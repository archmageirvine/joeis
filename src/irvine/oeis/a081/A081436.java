package irvine.oeis.a081;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A081436 Fifth subdiagonal in array of n-gonal numbers A081422.
 * @author Sean A. Irvine
 */
public class A081436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081436() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 7, 24, 58});
  }
}
