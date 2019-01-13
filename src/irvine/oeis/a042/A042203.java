package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042203.
 * @author Sean A. Irvine
 */
public class A042203 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042203() {
    super(new long[] {-1, 0, 1252, 0}, new long[] {1, 25, 1251, 31300});
  }
}
