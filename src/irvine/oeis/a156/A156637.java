package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156637 Pell numbers <code>A000129 mod 9</code>. Period <code>24</code>: repeat 0,1,2,5,3,2,7,7,3,4,2,8,0,8,7,4,6,7,2,2,6,5,7,1.
 * @author Sean A. Irvine
 */
public class A156637 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156637() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 2, 5, 3, 2, 7, 7, 3, 4, 2, 8, 0, 8, 7, 4, 6, 7, 2, 2, 6, 5, 7, 1});
  }
}
