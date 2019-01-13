package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256647.
 * @author Sean A. Irvine
 */
public class A256647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256647() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 28, 106});
  }
}
