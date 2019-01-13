package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164484.
 * @author Sean A. Irvine
 */
public class A164484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164484() {
    super(new long[] {2, -3, 0, 0, 2}, new long[] {13, 20, 31, 48, 74});
  }
}
