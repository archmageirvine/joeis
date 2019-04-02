package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041028 Numerators of continued fraction convergents to sqrt(19).
 * @author Sean A. Irvine
 */
public class A041028 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041028() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 340, 0, 0, 0, 0, 0}, new long[] {4, 9, 13, 48, 61, 170, 1421, 3012, 4433, 16311, 20744, 57799});
  }
}
