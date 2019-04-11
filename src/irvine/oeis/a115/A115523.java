package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115523 Number of ordered quadruples (i,j,k,l) in range <code>[0..n]</code> satisfying i <code>== j mod 2, j == k mod 3</code> and <code>k ==</code> l <code>mod 4</code>.
 * @author Sean A. Irvine
 */
public class A115523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115523() {
    super(new long[] {1, -1, 0, -1, 0, 1, 0, 1, -1, 0, 0, 0, -2, 2, 0, 2, 0, -2, 0, -2, 2, 0, 0, 0, 1, -1, 0, -1, 0, 1, 0, 1}, new long[] {1, 2, 5, 12, 33, 60, 111, 176, 287, 440, 637, 864, 1237, 1652, 2147, 2752, 3555, 4428, 5517, 6700, 8177, 9878, 11785, 13824, 16441, 19214, 22265, 25676, 29685, 33900, 38715, 43776});
  }
}
