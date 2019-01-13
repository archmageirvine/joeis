package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271040.
 * @author Sean A. Irvine
 */
public class A271040 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271040() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 0, 0, 0, 0, 0, 10});
  }
}
