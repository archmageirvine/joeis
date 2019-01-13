package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164013.
 * @author Sean A. Irvine
 */
public class A164013 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164013() {
    super(new long[] {1, -3, 3}, new long[] {3, 12, 30});
  }
}
