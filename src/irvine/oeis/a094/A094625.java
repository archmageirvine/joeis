package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094625 Palindromic sequence whose n-th term digits sum to 2n.
 * @author Sean A. Irvine
 */
public class A094625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094625() {
    super(new long[] {-10, 0, 11, 0}, new long[] {0, 2, 22, 33});
  }
}
