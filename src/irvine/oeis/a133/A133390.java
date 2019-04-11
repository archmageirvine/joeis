package irvine.oeis.a133;

import irvine.oeis.LinearRecurrence;

/**
 * A133390 Period 18: repeat <code>1, 4, 7, 2, 2, 5, 4, 1, 1, 8, 5, 2, 7, 7, 4, 5, 8, 8</code>.
 * @author Sean A. Irvine
 */
public class A133390 extends LinearRecurrence {

  /** Construct the sequence. */
  public A133390() {
    super(new long[] {1, -1, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 4, 7, 2, 2, 5, 4, 1, 1, 8});
  }
}
