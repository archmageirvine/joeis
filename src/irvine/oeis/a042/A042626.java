package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042626 Numerators of continued fraction convergents to sqrt(843).
 * @author Sean A. Irvine
 */
public class A042626 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042626() {
    super(new long[] {-1, 0, 1684, 0}, new long[] {29, 842, 48865, 1417927});
  }
}
