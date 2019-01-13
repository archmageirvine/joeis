package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157112.
 * @author Sean A. Irvine
 */
public class A157112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157112() {
    super(new long[] {1, -3, 3}, new long[] {285769, 8478963, 27975201});
  }
}
