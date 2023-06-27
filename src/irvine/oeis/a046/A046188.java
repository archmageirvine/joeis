package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046188 Indices of octagonal numbers which are also pentagonal.
 * @author Sean A. Irvine
 */
public class A046188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046188() {
    super(1, new long[] {1, -1, -1154, 1154, 1}, new long[] {1, 8, 725, 8844, 836265});
  }
}
