package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055844 A second-order recursive sequence.
 * @author Sean A. Irvine
 */
public class A055844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055844() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 14, 95, 440, 1595, 4862, 13013, 31460, 70070, 145860});
  }
}
