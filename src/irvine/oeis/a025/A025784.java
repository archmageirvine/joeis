package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025784 Expansion of <code>1/((1-x)(1-x^7)(1-x^8))</code>.
 * @author Sean A. Irvine
 */
public class A025784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025784() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, -1, 0, 1, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 4, 5});
  }
}
