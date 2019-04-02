package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041176 Numerators of continued fraction convergents to sqrt(98).
 * @author Sean A. Irvine
 */
public class A041176 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041176() {
    super(new long[] {-1, 0, 0, 0, 198, 0, 0, 0}, new long[] {9, 10, 89, 99, 1871, 1970, 17631, 19601});
  }
}
