package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099163 Expansion of (1-2*x^2)/((1-2*x)*(1+x-x^2)).
 * @author Sean A. Irvine
 */
public class A099163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099163() {
    super(new long[] {-2, 3, 1}, new long[] {1, 1, 2});
  }
}
