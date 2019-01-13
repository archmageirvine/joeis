package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139616.
 * @author Sean A. Irvine
 */
public class A139616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139616() {
    super(new long[] {-1, 2}, new long[] {16, 136});
  }
}
