package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060961.
 * @author Sean A. Irvine
 */
public class A060961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060961() {
    super(new long[] {1, 0, 1, 0, 1}, new long[] {1, 1, 1, 2, 3});
  }
}
