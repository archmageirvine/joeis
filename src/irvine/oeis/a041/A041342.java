package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041342 Numerators of continued fraction convergents to sqrt(185).
 * @author Sean A. Irvine
 */
public class A041342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041342() {
    super(new long[] {1, 0, 0, 0, 0, 136, 0, 0, 0, 0}, new long[] {13, 14, 27, 41, 68, 1809, 1877, 3686, 5563, 9249});
  }
}
