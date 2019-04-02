package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042498 Numerators of continued fraction convergents to sqrt(777).
 * @author Sean A. Irvine
 */
public class A042498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042498() {
    super(new long[] {-1, 0, 0, 0, 446, 0, 0, 0}, new long[] {27, 28, 195, 223, 12237, 12460, 86997, 99457});
  }
}
