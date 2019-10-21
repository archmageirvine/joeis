package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052912 Expansion of <code>1/(1-2*x-2*x^3)</code>.
 * @author Sean A. Irvine
 */
public class A052912 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052912() {
    super(new long[] {2, 0, 2}, new long[] {1, 2, 4});
  }
}
