package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164304.
 * @author Sean A. Irvine
 */
public class A164304 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164304() {
    super(new long[] {-2, 4}, new long[] {3, 14});
  }
}
