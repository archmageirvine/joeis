package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157787 <code>8984250n - 2515920</code>.
 * @author Sean A. Irvine
 */
public class A157787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157787() {
    super(new long[] {-1, 2}, new long[] {6468330, 15452580});
  }
}
