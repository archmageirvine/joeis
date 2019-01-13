package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259968.
 * @author Sean A. Irvine
 */
public class A259968 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259968() {
    super(new long[] {1, 0, 1, 1}, new long[] {1, 1, 3, 6});
  }
}
