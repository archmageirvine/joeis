package irvine.oeis.a185;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A185123 a(n) = n 9's sandwiched between two 1's.
 * @author Sean A. Irvine
 */
public class A185123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185123() {
    super(new long[] {-10, 11}, new long[] {11, 191});
  }
}
