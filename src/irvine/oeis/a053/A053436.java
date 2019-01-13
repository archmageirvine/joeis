package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053436.
 * @author Sean A. Irvine
 */
public class A053436 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053436() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {2, 3, 5, 6, 10, 11, 18});
  }
}
