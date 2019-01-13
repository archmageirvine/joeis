package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037577.
 * @author Sean A. Irvine
 */
public class A037577 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037577() {
    super(new long[] {-5, 1, 5}, new long[] {1, 8, 41});
  }
}
