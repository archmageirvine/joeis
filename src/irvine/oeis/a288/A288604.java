package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288604.
 * @author Sean A. Irvine
 */
public class A288604 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288604() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 51, 1968, 26214, 195312, 1007769, 4035360, 13421772, 38742048, 99999999});
  }
}
