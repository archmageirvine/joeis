package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046172 Indices of pentagonal numbers <code>(A000326)</code> that are also squares <code>(A000290)</code>.
 * @author Sean A. Irvine
 */
public class A046172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046172() {
    super(new long[] {1, -99, 99}, new long[] {1, 81, 7921});
  }
}
