package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033507.
 * @author Sean A. Irvine
 */
public class A033507 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033507() {
    super(new long[] {1, -1, -23, 29, 91, -111, -41, 41, 9}, new long[] {1, 5, 71, 823, 10012, 120465, 1453535, 17525619, 211351945});
  }
}
