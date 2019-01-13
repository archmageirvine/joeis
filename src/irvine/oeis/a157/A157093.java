package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157093.
 * @author Sean A. Irvine
 */
public class A157093 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157093() {
    super(new long[] {1, -19, 19}, new long[] {4, 44, 764});
  }
}
