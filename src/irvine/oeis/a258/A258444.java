package irvine.oeis.a258;

import irvine.math.z.Z;
import irvine.oeis.LinearRecurrence;

/**
 * A258444.
 * @author Sean A. Irvine
 */
public class A258444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258444() {
    super(new long[] {1, -1416317955, 1416317955},
      new Z[] {
        Z.valueOf(1349094322576L),
        new Z("1910746510353532612000"),
        new Z("2706224588156555124000697809136")
    });
  }
}
