package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053755.
 * @author Sean A. Irvine
 */
public class A053755 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053755() {
    super(new long[] {1, -3, 3}, new long[] {1, 5, 17});
  }
}
