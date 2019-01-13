package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216115.
 * @author Sean A. Irvine
 */
public class A216115 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216115() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1020, 11020, 39600, 99960, 208900});
  }
}
