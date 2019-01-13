package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131465.
 * @author Sean A. Irvine
 */
public class A131465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131465() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 3, 47, 259, 861});
  }
}
