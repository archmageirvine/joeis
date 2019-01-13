package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037739.
 * @author Sean A. Irvine
 */
public class A037739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037739() {
    super(new long[] {-6, 1, 0, 0, 6}, new long[] {2, 13, 81, 486, 2918});
  }
}
