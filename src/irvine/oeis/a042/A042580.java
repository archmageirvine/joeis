package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042580 Numerators of continued fraction convergents to <code>sqrt(819)</code>.
 * @author Sean A. Irvine
 */
public class A042580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042580() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3148, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {28, 29, 57, 86, 143, 229, 372, 601, 973, 1574, 89117, 90691, 179808, 270499, 450307, 720806, 1171113, 1891919, 3063032, 4954951});
  }
}
