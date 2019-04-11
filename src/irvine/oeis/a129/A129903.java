package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129903 Expansion of <code>1/(1+x^2-x^3+x^4)</code>.
 * @author Sean A. Irvine
 */
public class A129903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129903() {
    super(new long[] {-1, 1, -1, 0}, new long[] {1, 0, -1, 1});
  }
}
