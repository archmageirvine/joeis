package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122656 <code>n*floor(n/2)^2</code>.
 * @author Sean A. Irvine
 */
public class A122656 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122656() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {0, 0, 2, 3, 16, 20, 54});
  }
}
