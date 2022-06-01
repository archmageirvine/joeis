package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046181 Indices of octagonal numbers which are also triangular.
 * @author Sean A. Irvine
 */
public class A046181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046181() {
    super(new long[] {1, -1, -98, 98, 1}, new long[] {1, 3, 63, 261, 6141});
  }
}
