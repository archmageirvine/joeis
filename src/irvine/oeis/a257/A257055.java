package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257055.
 * @author Sean A. Irvine
 */
public class A257055 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257055() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 5, 18, 50});
  }
}
