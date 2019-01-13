package irvine.oeis.a257;

import irvine.oeis.LinearRecurrence;

/**
 * A257602.
 * @author Sean A. Irvine
 */
public class A257602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A257602() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 6, 41, 156, 426});
  }
}
