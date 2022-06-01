package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016256 Expansion of 1/((1-x)*(1-8*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A016256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016256() {
    super(new long[] {72, -89, 18}, new long[] {1, 18, 235});
  }
}
