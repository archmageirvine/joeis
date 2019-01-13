package irvine.oeis.a256;

import irvine.oeis.LinearRecurrence;

/**
 * A256328.
 * @author Sean A. Irvine
 */
public class A256328 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256328() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 2, 15, 47, 108});
  }
}
