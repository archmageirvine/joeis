package irvine.oeis.a265;

import irvine.oeis.LinearRecurrence;

/**
 * A265805.
 * @author Sean A. Irvine
 */
public class A265805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A265805() {
    super(new long[] {-1, 2, 2}, new long[] {-9, -47, -105});
  }
}
