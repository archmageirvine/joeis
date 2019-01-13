package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259157.
 * @author Sean A. Irvine
 */
public class A259157 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259157() {
    super(new long[] {1, -1155, 1155}, new long[] {3, 3570, 4119885});
  }
}
