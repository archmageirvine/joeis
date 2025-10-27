package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099134 Expansion of x/(1-2*x-19*x^2).
 * @author Sean A. Irvine
 */
public class A099134 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099134() {
    super(new long[] {19, 2}, new long[] {0, 1});
  }
}
