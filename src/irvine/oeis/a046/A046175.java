package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046175 Indices of triangular numbers which are also pentagonal.
 * @author Sean A. Irvine
 */
public class A046175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046175() {
    super(new long[] {1, -15, 15}, new long[] {0, 1, 20});
  }
}
