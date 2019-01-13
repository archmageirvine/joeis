package irvine.oeis.a190;

import irvine.oeis.LinearRecurrence;

/**
 * A190139.
 * @author Sean A. Irvine
 */
public class A190139 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190139() {
    super(new long[] {1, 1, 1, 2}, new long[] {1, 1, 3, 8});
  }
}
