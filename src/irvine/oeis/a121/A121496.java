package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121496 Run lengths of successive numbers in <code>A068225</code>.
 * @author Sean A. Irvine
 */
public class A121496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121496() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 2, 2, 1, 3});
  }
}
