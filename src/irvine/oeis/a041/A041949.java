package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041949 Denominators of continued fraction convergents to sqrt(497).
 * @author Sean A. Irvine
 */
public class A041949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041949() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2403774, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 7, 17, 92, 569, 2937, 6443, 15823, 53912, 2387951, 7217765, 16823481, 40864727, 221147116, 1367747423, 7059884231L, 15487515885L, 38034916001L, 129592263888L});
  }
}
