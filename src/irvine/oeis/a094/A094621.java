package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094621 Expansion of x*(11+13*x+20*x^2) / ( (x-1)*(1+x)*(10*x^2-1) ).
 * @author Sean A. Irvine
 */
public class A094621 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094621() {
    super(new long[] {-10, 0, 11, 0}, new long[] {0, 11, 13, 141});
  }
}
