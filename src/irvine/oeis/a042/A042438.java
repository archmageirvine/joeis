package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042438 Numerators of continued fraction convergents to sqrt(747).
 * @author Sean A. Irvine
 */
public class A042438 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042438() {
    super(new long[] {-1, 0, 164, 0}, new long[] {27, 82, 4455, 13447});
  }
}
