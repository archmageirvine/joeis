package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046172 Indices of pentagonal numbers (A000326) that are also squares (A000290).
 * @author Sean A. Irvine
 */
public class A046172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046172() {
    super(new long[] {1, -99, 99}, new long[] {1, 81, 7921});
  }
}
