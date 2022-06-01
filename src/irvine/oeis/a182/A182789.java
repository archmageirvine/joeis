package irvine.oeis.a182;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A182789 Number of n-colorings of the Triangle Graph of order 4.
 * @author Sean A. Irvine
 */
public class A182789 extends LinearRecurrence {

  /** Construct the sequence. */
  public A182789() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 0, 0, 6, 2112, 98820, 1574400, 13676250, 80631936, 363204072, 1342218240});
  }
}
