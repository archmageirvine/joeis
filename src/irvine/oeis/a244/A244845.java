package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244845.
 * @author Sean A. Irvine
 */
public class A244845 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244845() {
    super(new long[] {1000, -1110, 111}, new long[] {111, 101111, 11011111});
  }
}
