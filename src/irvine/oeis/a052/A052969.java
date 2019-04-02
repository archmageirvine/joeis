package irvine.oeis.a052;

import irvine.oeis.LinearRecurrence;

/**
 * A052969 Expansion of (1-x)/(1-x-2x^2+x^4).
 * @author Sean A. Irvine
 */
public class A052969 extends LinearRecurrence {

  /** Construct the sequence. */
  public A052969() {
    super(new long[] {-1, 0, 2, 1}, new long[] {1, 0, 2, 2});
  }
}
