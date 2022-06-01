package irvine.oeis.a123;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A123009 Expansion of x*(1 + 5*x)/(1 - 2*x - 49*x^2).
 * @author Sean A. Irvine
 */
public class A123009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123009() {
    super(new long[] {49, 2}, new long[] {1, 7});
  }
}
