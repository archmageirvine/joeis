package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035344 Expansion of <code>1/((1 - x)*(1 - 4*x + 2 * x^2))</code>.
 * @author Sean A. Irvine
 */
public class A035344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035344() {
    super(new long[] {2, -6, 5}, new long[] {1, 5, 19});
  }
}
