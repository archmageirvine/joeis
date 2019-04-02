package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042302 Numerators of continued fraction convergents to sqrt(678).
 * @author Sean A. Irvine
 */
public class A042302 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042302() {
    super(new long[] {-1, 0, 1354, 0}, new long[] {26, 677, 35230, 916657});
  }
}
