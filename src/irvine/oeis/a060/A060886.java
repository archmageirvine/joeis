package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060886.
 * @author Sean A. Irvine
 */
public class A060886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060886() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1, 13, 73, 241});
  }
}
