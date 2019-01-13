package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167586.
 * @author Sean A. Irvine
 */
public class A167586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167586() {
    super(new long[] {-1, 4, -6, 4}, new long[] {76, 372, 1020, 2212});
  }
}
