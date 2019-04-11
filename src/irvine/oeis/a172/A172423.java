package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172423 Period length 10: repeat <code>0,9,2,7,4,5,6,3,8,1</code>.
 * @author Sean A. Irvine
 */
public class A172423 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172423() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {0, 9, 2, 7, 4, 5, 6, 3, 8, 1});
  }
}
