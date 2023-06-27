package irvine.oeis.a202;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A202563 Numbers which are both decagonal and pentagonal.
 * @author Sean A. Irvine
 */
public class A202563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202563() {
    super(1, new long[] {1, -9603, 9603}, new long[] {1, 12376, 118837251});
  }
}
