package irvine.oeis.a132;

import irvine.oeis.LinearRecurrence;

/**
 * A132583 <code>a(n) = n</code> 2's sandwiched between two 1's.
 * @author Sean A. Irvine
 */
public class A132583 extends LinearRecurrence {

  /** Construct the sequence. */
  public A132583() {
    super(new long[] {-10, 11}, new long[] {11, 121});
  }
}
