package irvine.oeis.a141;

import irvine.oeis.LinearRecurrence;

/**
 * A141259 <code>a(n) == {0,1,3,4,5,7,9,11} mod 12</code>; <code>n&gt;0</code>.
 * @author Sean A. Irvine
 */
public class A141259 extends LinearRecurrence {

  /** Construct the sequence. */
  public A141259() {
    super(new long[] {-1, 2, -2, 2, -2, 2, -2, 2}, new long[] {1, 3, 4, 5, 7, 9, 11, 12});
  }
}
