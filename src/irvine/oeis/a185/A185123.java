package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185123 <code>a(n) = n 9</code>'s sandwiched between two <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A185123 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185123() {
    super(new long[] {-10, 11}, new long[] {11, 191});
  }
}
