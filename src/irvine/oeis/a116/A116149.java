package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116149 a(n) = sum of n consecutive cubes after n^3.
 * @author Sean A. Irvine
 */
public class A116149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116149() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {8, 91, 405, 1196, 2800});
  }
}
