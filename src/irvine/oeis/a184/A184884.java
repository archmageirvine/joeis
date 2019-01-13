package irvine.oeis.a184;

import irvine.oeis.LinearRecurrence;

/**
 * A184884.
 * @author Sean A. Irvine
 */
public class A184884 extends LinearRecurrence {

  /** Construct the sequence. */
  public A184884() {
    super(new long[] {1, -1, 2, 2, 1}, new long[] {1, 1, 2, 6, 11});
  }
}
