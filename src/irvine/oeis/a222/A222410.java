package irvine.oeis.a222;

import irvine.oeis.LinearRecurrence;

/**
 * A222410 Partial sums of A008534, or crystal ball sequence for {A_6}* lattice.
 * @author Sean A. Irvine
 */
public class A222410 extends LinearRecurrence {

  /** Construct the sequence. */
  public A222410() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 15, 113, 575, 2171, 6581, 16955});
  }
}
