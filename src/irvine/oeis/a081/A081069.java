package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081069.
 * @author Sean A. Irvine
 */
public class A081069 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081069() {
    super(new long[] {1, -8, 8}, new long[] {4, 9, 49});
  }
}
