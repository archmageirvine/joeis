package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046177 Squares <code>(A000290)</code> which are also hexagonal numbers <code>(A000384)</code>.
 * @author Sean A. Irvine
 */
public class A046177 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046177() {
    super(new long[] {1, -1155, 1155}, new long[] {1, 1225, 1413721});
  }
}
