package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168175 Expansion of <code>1/(1 - 4*x + 7*x^2)</code>.
 * @author Sean A. Irvine
 */
public class A168175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168175() {
    super(new long[] {-7, 4}, new long[] {1, 4});
  }
}
