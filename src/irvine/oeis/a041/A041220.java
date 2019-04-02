package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041220 Numerators of continued fraction convergents to sqrt(122).
 * @author Sean A. Irvine
 */
public class A041220 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041220() {
    super(new long[] {1, 22}, new long[] {11, 243});
  }
}
