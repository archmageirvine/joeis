package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228958 <code>a(n) = 1*2 + 3*4 + 5*6 + 7*8 + 9*10 + 11*12 + 13*14 + ... +</code> (up to <code>n)</code>.
 * @author Sean A. Irvine
 */
public class A228958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228958() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 2, 5, 14, 19, 44, 51});
  }
}
