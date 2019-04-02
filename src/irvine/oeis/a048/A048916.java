package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048916 Indices of 9-gonal numbers which are also hexagonal.
 * @author Sean A. Irvine
 */
public class A048916 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048916() {
    super(new long[] {1, -1, -64514, 64514, 1}, new long[] {1, 10, 39025, 621946, 2517635809L});
  }
}
