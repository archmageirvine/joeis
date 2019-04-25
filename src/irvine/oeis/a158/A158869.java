package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158869 Number of ways of filling <code>a 2 by 3 by 2*n</code> hole with <code>1 by 2 by 2</code> bricks.
 * @author Sean A. Irvine
 */
public class A158869 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158869() {
    super(new long[] {-3, 6}, new long[] {1, 5});
  }
}
