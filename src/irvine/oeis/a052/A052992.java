package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052992 Expansion of <code>1/((1 - x)*(1 - 2*x)*(1 + 2*x))</code>.
 * @author Sean A. Irvine
 */
public class A052992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052992() {
    super(new long[] {-4, 4, 1}, new long[] {1, 1, 5});
  }
}
