package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131751 Numbers that are both centered triangular and centered pentagonal.
 * @author Sean A. Irvine
 */
public class A131751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131751() {
    super(new long[] {1, -63, 63}, new long[] {1, 31, 1891});
  }
}
