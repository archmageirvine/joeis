package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164455.
 * @author Sean A. Irvine
 */
public class A164455 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164455() {
    super(new long[] {2, -3, 0, 0, 2}, new long[] {13, 22, 36, 56, 89});
  }
}
