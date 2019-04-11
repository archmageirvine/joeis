package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041318 Numerators of continued fraction convergents to <code>sqrt(173)</code>.
 * @author Sean A. Irvine
 */
public class A041318 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041318() {
    super(new long[] {1, 0, 0, 0, 0, 2236, 0, 0, 0, 0}, new long[] {13, 79, 92, 171, 1118, 29239, 176552, 205791, 382343, 2499849});
  }
}
