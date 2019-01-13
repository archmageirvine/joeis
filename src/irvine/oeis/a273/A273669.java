package irvine.oeis.a273;

import irvine.oeis.LinearRecurrence;

/**
 * A273669.
 * @author Sean A. Irvine
 */
public class A273669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A273669() {
    super(new long[] {-1, 1, 1}, new long[] {2, 9, 12});
  }
}
