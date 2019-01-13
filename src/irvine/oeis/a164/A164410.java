package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164410.
 * @author Sean A. Irvine
 */
public class A164410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164410() {
    super(new long[] {2, 0, 1}, new long[] {13, 22, 38});
  }
}
