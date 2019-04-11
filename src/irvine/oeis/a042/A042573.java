package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042573 Denominators of continued fraction convergents to <code>sqrt(815)</code>.
 * @author Sean A. Irvine
 */
public class A042573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042573() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 313288, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 9, 11, 31, 166, 363, 529, 2479, 3008, 5487, 310280, 315767, 626047, 2819955, 3446002, 9711959, 52005797, 113723553, 165729350, 776640953, 942370303, 1719011256});
  }
}
