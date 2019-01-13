package irvine.oeis.a151;

import irvine.oeis.LinearRecurrence;

/**
 * A151912.
 * @author Sean A. Irvine
 */
public class A151912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A151912() {
    super(new long[] {-16, 16, -12, 4}, new long[] {1, -4, -28, -56});
  }
}
