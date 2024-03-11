package irvine.oeis.a104;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A104770 Expansion of G.f. (1+x^2)/(1+x-x^3).
 * @author Sean A. Irvine
 */
public class A104770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A104770() {
    super(new long[] {1, 0, -1}, new long[] {1, -1, 2});
  }
}
