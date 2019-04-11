package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042028 Numerators of continued fraction convergents to <code>sqrt(538)</code>.
 * @author Sean A. Irvine
 */
public class A042028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042028() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 138102, 0, 0, 0, 0, 0, 0}, new long[] {23, 116, 835, 951, 1786, 13453, 69051, 3189799, 16018046, 115316121, 131334167, 246650288, 1857886183, 9536081203L});
  }
}
