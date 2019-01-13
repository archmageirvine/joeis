package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159697.
 * @author Sean A. Irvine
 */
public class A159697 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159697() {
    super(new long[] {-4, 4}, new long[] {9, 19});
  }
}
