package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027657 Expansion of (1+4*x)/(1-34*x+x^2).
 * @author Sean A. Irvine
 */
public class A027657 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027657() {
    super(new long[] {-1, 34}, new long[] {1, 38});
  }
}
