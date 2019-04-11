package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271494 Expansion of <code>(1+16*x)/((1+4*x)*(1-8*x))</code>.
 * @author Sean A. Irvine
 */
public class A271494 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271494() {
    super(new long[] {32, 4}, new long[] {1, 20});
  }
}
