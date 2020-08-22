package irvine.oeis.a104;

import irvine.oeis.LinearRecurrence;

/**
 * A104473 a(n) = binomial(n+2,2)*binomial(n+6,2).
 * @author Sean A. Irvine
 */
public class A104473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104473() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {15, 63, 168, 360, 675});
  }
}
