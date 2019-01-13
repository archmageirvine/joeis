package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122012.
 * @author Sean A. Irvine
 */
public class A122012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122012() {
    super(new long[] {-1, 0, 3, 0}, new long[] {0, 3, 3, 7});
  }
}
