package irvine.oeis.a112;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A112553 Expansion of 1/( (1+x^2)*(1-x+x^2) ).
 * @author Sean A. Irvine
 */
public class A112553 extends LinearRecurrence {

  /** Construct the sequence. */
  public A112553() {
    super(new long[] {-1, 1, -2, 1}, new long[] {1, 1, -1, -2});
  }
}
