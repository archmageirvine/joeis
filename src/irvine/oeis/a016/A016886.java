package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016886.
 * @author Sean A. Irvine
 */
public class A016886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016886() {
    super(new long[] {1, -3, 3}, new long[] {9, 64, 169});
  }
}
