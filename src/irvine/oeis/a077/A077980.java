package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077980.
 * @author Sean A. Irvine
 */
public class A077980 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077980() {
    super(new long[] {-2, -2, -1}, new long[] {1, -1, -1});
  }
}
