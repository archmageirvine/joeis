package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015587 Expansion of x/(1 - 9*x - 11*x^2).
 * @author Sean A. Irvine
 */
public class A015587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015587() {
    super(new long[] {11, 9}, new long[] {0, 1});
  }
}
