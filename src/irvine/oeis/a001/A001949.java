package irvine.oeis.a001;

import irvine.oeis.LinearRecurrence;

/**
 * A001949 A probability difference equation.
 * @author Sean A. Irvine
 */
public class A001949 extends LinearRecurrence {

  /** Construct the sequence. */
  public A001949() {
    super(new long[] {-1, 0, 0, 0, 0, 2}, new long[] {0, 0, 0, 0, 0, 1});
  }
}
