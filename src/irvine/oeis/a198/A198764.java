package irvine.oeis.a198;

import irvine.oeis.LinearRecurrence;

/**
 * A198764 <code>6*5^n-1</code>.
 * @author Sean A. Irvine
 */
public class A198764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198764() {
    super(new long[] {-5, 6}, new long[] {5, 29});
  }
}
