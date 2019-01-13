package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164427.
 * @author Sean A. Irvine
 */
public class A164427 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164427() {
    super(new long[] {-1, 1, 0, 1, 1}, new long[] {13, 22, 37, 63, 105});
  }
}
