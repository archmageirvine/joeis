package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098230 75-gonal numbers: n(73n-71)/2.
 * @author Sean A. Irvine
 */
public class A098230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098230() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 75});
  }
}
