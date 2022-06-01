package irvine.oeis.a091;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A091971 G.f.: (1+x^3)*(1+x^5)*(1+x^6)/((1-x^4)*(1-x^5)*(1-x^6)).
 * @author Sean A. Irvine
 */
public class A091971 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091971() {
    super(new long[] {1, -1, 0, -1, 1, -1, 1, 0, 1}, new long[] {1, 0, 0, 1, 1, 2, 2, 1, 3});
  }
}
