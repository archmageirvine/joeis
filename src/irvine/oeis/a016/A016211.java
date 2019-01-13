package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016211.
 * @author Sean A. Irvine
 */
public class A016211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016211() {
    super(new long[] {18, -27, 10}, new long[] {1, 10, 73});
  }
}
