package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078069 Expansion of <code>(1-x)/(1+2*x+2*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A078069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078069() {
    super(new long[] {-2, -2}, new long[] {1, -3});
  }
}
