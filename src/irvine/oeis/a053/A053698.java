package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053698.
 * @author Sean A. Irvine
 */
public class A053698 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053698() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 4, 15, 40});
  }
}
