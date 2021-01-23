package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087171 Expansion of (1 + 5*x)/(1 + 9*x + 25*x^2).
 * @author Sean A. Irvine
 */
public class A087171 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087171() {
    super(new long[] {-25, -9}, new long[] {1, -4});
  }
}
