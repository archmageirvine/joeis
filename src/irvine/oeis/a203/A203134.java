package irvine.oeis.a203;

import irvine.oeis.LinearRecurrence;

/**
 * A203134 Decagonal hexagonal numbers.
 * @author Sean A. Irvine
 */
public class A203134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A203134() {
    super(new long[] {1, -1155, 1155}, new long[] {1, 1540, 1777555});
  }
}
