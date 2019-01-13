package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178144.
 * @author Sean A. Irvine
 */
public class A178144 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178144() {
    super(new long[] {1, 2, 2, 1, 0, -1, -2, -2}, new long[] {0, 2, 3, 2, 5, 5, 0, 2});
  }
}
