package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041048 Numerators of continued fraction convergents to sqrt(30).
 * @author Sean A. Irvine
 */
public class A041048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041048() {
    super(new long[] {-1, 0, 22, 0}, new long[] {5, 11, 115, 241});
  }
}
