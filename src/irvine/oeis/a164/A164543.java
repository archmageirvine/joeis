package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164543.
 * @author Sean A. Irvine
 */
public class A164543 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164543() {
    super(new long[] {-17, 10}, new long[] {1, 17});
  }
}
