package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171067.
 * @author Sean A. Irvine
 */
public class A171067 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171067() {
    super(new long[] {-1, 1, 10, 1}, new long[] {0, 1, 1, 10});
  }
}
