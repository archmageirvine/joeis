package irvine.oeis.a182;

import irvine.oeis.LinearRecurrence;

/**
 * A182228.
 * @author Sean A. Irvine
 */
public class A182228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182228() {
    super(new long[] {3, -1}, new long[] {0, 1});
  }
}
