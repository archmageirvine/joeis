package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025910.
 * @author Sean A. Irvine
 */
public class A025910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025910() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, new long[] {1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 2, 1, 1, 1});
  }
}
