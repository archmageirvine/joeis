package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116149 <code>a(n) =</code> sum of n consecutive cubes after <code>n^3</code>.
 * @author Sean A. Irvine
 */
public class A116149 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116149() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {8, 91, 405, 1196, 2800});
  }
}
