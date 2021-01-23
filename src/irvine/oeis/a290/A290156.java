package irvine.oeis.a290;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A290156 Tribonacci-like sequence of composite numbers with a(0) = 99202581681909167232, a(1) = 67600144946390082339 and a(2) = 139344212815127987596.
 * @author Sean A. Irvine
 */
public class A290156 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290156() {
    super(new long[] {1, 1, 1},
      new Z[] {
        new Z("99202581681909167232"),
        new Z("67600144946390082339"),
        new Z("139344212815127987596")
    });
  }
}
