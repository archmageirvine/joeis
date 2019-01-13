package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017537.
 * @author Sean A. Irvine
 */
public class A017537 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017537() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 371293, 9765625, 69343957, 282475249, 844596301});
  }
}
