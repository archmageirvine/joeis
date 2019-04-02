package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041221 Denominators of continued fraction convergents to sqrt(122).
 * @author Sean A. Irvine
 */
public class A041221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041221() {
    super(new long[] {1, 22}, new long[] {1, 22});
  }
}
