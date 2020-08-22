package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034299 Alternating sum transform (PSumSIGN) of A000975.
 * @author Sean A. Irvine
 */
public class A034299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034299() {
    super(new long[] {-2, -1, 3, 1}, new long[] {1, 1, 4, 6});
  }
}
