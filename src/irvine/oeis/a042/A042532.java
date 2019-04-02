package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042532 Numerators of continued fraction convergents to sqrt(795).
 * @author Sean A. Irvine
 */
public class A042532 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042532() {
    super(new long[] {-1, 0, 0, 0, 13252, 0, 0, 0}, new long[] {28, 141, 1297, 6626, 372353, 1868391, 17187872, 87807751});
  }
}
