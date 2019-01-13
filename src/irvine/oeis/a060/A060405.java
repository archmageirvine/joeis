package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060405.
 * @author Sean A. Irvine
 */
public class A060405 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060405() {
    super(new long[] {-1, -3, 0, 3}, new long[] {2, 2, 5, 9});
  }
}
