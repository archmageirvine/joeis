package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158484 49n^2 - 7.
 * @author Sean A. Irvine
 */
public class A158484 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158484() {
    super(new long[] {1, -3, 3}, new long[] {42, 189, 434});
  }
}
