package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038989.
 * @author Sean A. Irvine
 */
public class A038989 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038989() {
    super(new long[] {-1, 2, 2, 2}, new long[] {1, 2, 5, 14});
  }
}
