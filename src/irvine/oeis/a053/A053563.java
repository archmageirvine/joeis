package irvine.oeis.a053;

import irvine.oeis.a068.A068596;

/**
 * A053563 Number of ternary Lyndon words of length n with trace 1 and subtrace 1 over GF(3). Same as the number of ternary Lyndon words of length n with trace 2 and subtrace 1 over GF(3).
 * @author Sean A. Irvine
 */
public class A053563 extends A068596 {

  /** Construct the sequence. */
  public A053563() {
    super(3, 1, 1);
  }
}
