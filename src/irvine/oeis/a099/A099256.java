package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099256 Expansion of g.f. (3-x)*(1+3*x+x^2)/((1-x-x^2)*(1+x-x^2)).
 * @author Sean A. Irvine
 */
public class A099256 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099256() {
    super(new long[] {-1, 0, 3, 0}, new long[] {3, 8, 9, 23});
  }
}
