package irvine.oeis.a225;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A225539 Numbers n where 2^n and n have the same digital root.
 * @author Sean A. Irvine
 */
public class A225539 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225539() {
    super(new long[] {-1, 1, 1}, new long[] {5, 16, 23});
  }
}
