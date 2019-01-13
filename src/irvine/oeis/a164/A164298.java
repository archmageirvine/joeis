package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164298.
 * @author Sean A. Irvine
 */
public class A164298 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164298() {
    super(new long[] {-2, 4}, new long[] {1, 10});
  }
}
