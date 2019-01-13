package irvine.oeis.a175;

import irvine.oeis.LinearRecurrence;

/**
 * A175655.
 * @author Sean A. Irvine
 */
public class A175655 extends LinearRecurrence {

  /** Construct the sequence. */
  public A175655() {
    super(new long[] {-6, 1, 3}, new long[] {1, 4, 8});
  }
}
