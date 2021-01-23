package irvine.oeis.a120;

import irvine.oeis.LinearRecurrence;

/**
 * A120462 Expansion of -2*x*(-3-2*x+4*x^2) / ((x-1)*(2*x+1)*(2*x-1)*(1+x)).
 * @author Sean A. Irvine
 */
public class A120462 extends LinearRecurrence {

  /** Construct the sequence. */
  public A120462() {
    super(new long[] {-4, 0, 5, 0}, new long[] {0, 6, 4, 22});
  }
}
