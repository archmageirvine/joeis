package irvine.oeis.a071;

import irvine.oeis.LinearRecurrence;

/**
 * A071231 <code>a(n) = (n^8 + n^4)/2</code>.
 * @author Sean A. Irvine
 */
public class A071231 extends LinearRecurrence {

  /** Construct the sequence. */
  public A071231() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 1, 136, 3321, 32896, 195625, 840456, 2883601, 8390656});
  }
}
