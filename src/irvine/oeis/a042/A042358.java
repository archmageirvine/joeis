package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042358 Numerators of continued fraction convergents to sqrt(706).
 * @author Sean A. Irvine
 */
public class A042358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042358() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 69190, 0, 0, 0, 0, 0, 0, 0}, new long[] {26, 27, 53, 186, 4889, 14853, 19742, 34595, 1818682, 1853277, 3671959, 12869154, 338269963, 1027679043, 1365949006, 2393628049L});
  }
}
