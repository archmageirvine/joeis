package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157610.
 * @author Sean A. Irvine
 */
public class A157610 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157610() {
    super(new long[] {1, -3, 3}, new long[] {28799, 116161, 262087});
  }
}
