package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214663.
 * @author Sean A. Irvine
 */
public class A214663 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214663() {
    super(new long[] {1, 3, 1, 1}, new long[] {1, 1, 2, 6});
  }
}
