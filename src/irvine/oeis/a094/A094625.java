package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094625 Expansion of x*(2+22*x+11*x^2)/((x-1)*(1+x)*(10*x^2-1)).
 * @author Sean A. Irvine
 */
public class A094625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094625() {
    super(new long[] {-10, 0, 11, 0}, new long[] {0, 2, 22, 33});
  }
}
