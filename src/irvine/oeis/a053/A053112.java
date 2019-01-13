package irvine.oeis.a053;

import irvine.oeis.LinearRecurrence;

/**
 * A053112.
 * @author Sean A. Irvine
 */
public class A053112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A053112() {
    super(new long[] {387420489, -387420489, 172186884, -44641044, 7440174, -826686, 61236, -2916, 81}, new long[] {1, 45, 1485, 40095, 938223, 19702683, 379980315, 6839645670L, 116273976390L});
  }
}
