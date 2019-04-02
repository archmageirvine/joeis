package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041775 Denominators of continued fraction convergents to sqrt(408).
 * @author Sean A. Irvine
 */
public class A041775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041775() {
    super(new long[] {-1, 0, 202, 0}, new long[] {1, 5, 201, 1010});
  }
}
