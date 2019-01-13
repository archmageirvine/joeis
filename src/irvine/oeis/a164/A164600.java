package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164600.
 * @author Sean A. Irvine
 */
public class A164600 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164600() {
    super(new long[] {-79, 18}, new long[] {1, 17});
  }
}
