package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041088 Numerators of continued fraction convergents to sqrt(52).
 * @author Sean A. Irvine
 */
public class A041088 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041088() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1298, 0, 0, 0, 0, 0}, new long[] {7, 29, 36, 101, 137, 649, 9223, 37541, 46764, 131069, 177833, 842401});
  }
}
