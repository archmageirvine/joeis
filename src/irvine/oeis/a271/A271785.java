package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271785.
 * @author Sean A. Irvine
 */
public class A271785 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271785() {
    super(new long[] {-1, -2, 1, 2}, new long[] {0, 3, 4, 9});
  }
}
