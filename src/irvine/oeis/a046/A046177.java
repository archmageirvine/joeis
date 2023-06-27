package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046177 Squares (A000290) which are also hexagonal numbers (A000384).
 * @author Sean A. Irvine
 */
public class A046177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046177() {
    super(1, new long[] {1, -1155, 1155}, new long[] {1, 1225, 1413721});
  }
}
