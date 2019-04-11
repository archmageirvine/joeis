package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123009 Expansion of <code>-x * (5*x+1) / (49*x^2+2*x-1)</code>.
 * @author Sean A. Irvine
 */
public class A123009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123009() {
    super(new long[] {49, 2}, new long[] {1, 7});
  }
}
