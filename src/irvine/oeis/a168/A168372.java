package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168372.
 * @author Sean A. Irvine
 */
public class A168372 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168372() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 1, 272, 9963, 131584, 978125, 5042736, 20185207, 67125248, 193739769});
  }
}
