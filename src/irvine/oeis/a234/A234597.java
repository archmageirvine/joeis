package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234597.
 * @author Sean A. Irvine
 */
public class A234597 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234597() {
    super(new long[] {1, 3, 1, 1}, new long[] {5, 11, 21, 48});
  }
}
