package irvine.oeis.a003;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A003729 Number of perfect matchings (or domino tilings) in graph C_{5} X P_{2n}.
 * @author Sean A. Irvine
 */
public class A003729 extends LinearRecurrence {

  /** Construct the sequence. */
  public A003729() {
    super(new long[] {-1, 19, -41, 19}, new long[] {11, 176, 2911, 48301});
  }
}
