package irvine.oeis.a007;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A007910 Expansion of 1/((1-2*x)*(1+x^2)).
 * @author Sean A. Irvine
 */
public class A007910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A007910() {
    super(new long[] {2, -1, 2}, new long[] {1, 2, 3});
  }
}

