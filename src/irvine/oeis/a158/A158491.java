package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158491 <code>20n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158491 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158491() {
    super(new long[] {1, -3, 3}, new long[] {19, 79, 179});
  }
}
