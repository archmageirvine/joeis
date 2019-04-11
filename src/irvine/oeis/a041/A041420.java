package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041420 Numerators of continued fraction convergents to <code>sqrt(226)</code>.
 * @author Sean A. Irvine
 */
public class A041420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041420() {
    super(new long[] {1, 30}, new long[] {15, 451});
  }
}
