package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042883 Denominators of continued fraction convergents to sqrt(973).
 * @author Sean A. Irvine
 */
public class A042883 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042883() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 1806446, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 5, 26, 57, 482, 1021, 5587, 28956, 1800859, 9033251, 46967114, 102967479, 870706946, 1844381371, 10092613801L, 52307450376L});
  }
}
