package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249586 Sum of the first n^3 cubes.
 * @author Sean A. Irvine
 */
public class A249586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249586() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 1, 1296, 142884, 4326400, 62015625, 549246096, 3480528016L, 17247043584L, 70801227225L, 250500250000L, 785786510916L, 2231605748736L});
  }
}
