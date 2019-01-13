package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167616.
 * @author Sean A. Irvine
 */
public class A167616 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167616() {
    super(new long[] {-1, 0, 2}, new long[] {0, 3, 8});
  }
}
