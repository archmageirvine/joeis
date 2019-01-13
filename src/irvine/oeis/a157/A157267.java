package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157267.
 * @author Sean A. Irvine
 */
public class A157267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157267() {
    super(new long[] {1, -3, 3}, new long[] {6049, 32257, 79201});
  }
}
