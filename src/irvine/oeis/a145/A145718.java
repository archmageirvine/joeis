package irvine.oeis.a145;

import irvine.oeis.LinearRecurrence;

/**
 * A145718.
 * @author Sean A. Irvine
 */
public class A145718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A145718() {
    super(new long[] {1, -2031, 2031}, new long[] {762, 1676527, 3403477826L});
  }
}
