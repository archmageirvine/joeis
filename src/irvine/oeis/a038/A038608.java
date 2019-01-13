package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038608.
 * @author Sean A. Irvine
 */
public class A038608 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038608() {
    super(new long[] {-1, -2}, new long[] {0, -1});
  }
}
