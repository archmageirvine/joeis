package irvine.oeis.a185;

import irvine.oeis.LinearRecurrence;

/**
 * A185647 Expansion of (1+2x)*(1+2*x^2)/((1-x)*(1+x)*(1-2*x^2)).
 * @author Sean A. Irvine
 */
public class A185647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A185647() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 2, 5, 10});
  }
}
