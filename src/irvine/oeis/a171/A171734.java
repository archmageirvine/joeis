package irvine.oeis.a171;

import irvine.oeis.LinearRecurrence;

/**
 * A171734 First differences of <code>A171733</code>.
 * @author Sean A. Irvine
 */
public class A171734 extends LinearRecurrence {

  /** Construct the sequence. */
  public A171734() {
    super(new long[] {-1, 0, 4, 0, -6, 0, 4, 0}, new long[] {2, 0, 6, 24, 10, 96, 14, 240});
  }
}
