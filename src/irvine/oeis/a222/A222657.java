package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222657.
 * @author Sean A. Irvine
 */
public class A222657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222657() {
    super(new long[] {-1, 1, 0, 1}, new long[] {1, 3, 3, 5});
  }
}
