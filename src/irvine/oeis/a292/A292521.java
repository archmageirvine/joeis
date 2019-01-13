package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292521.
 * @author Sean A. Irvine
 */
public class A292521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292521() {
    super(new long[] {1, -2, 1, 0}, new long[] {2, 0, 1, -1});
  }
}
