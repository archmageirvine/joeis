package irvine.oeis.a176;

import irvine.oeis.LinearRecurrence;

/**
 * A176961.
 * @author Sean A. Irvine
 */
public class A176961 extends LinearRecurrence {

  /** Construct the sequence. */
  public A176961() {
    super(new long[] {-4, 4, 1}, new long[] {1, 2, 8});
  }
}
