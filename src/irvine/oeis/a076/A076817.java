package irvine.oeis.a076;

import irvine.oeis.LinearRecurrence;

/**
 * A076817.
 * @author Sean A. Irvine
 */
public class A076817 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076817() {
    super(new long[] {1, -1, 1, -1, 1, -1, 1, -1, 1, -1, 1}, new long[] {10, 10, 20, 40, 50, 25, 8, 8, 25, 50, 40});
  }
}
