package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193872 Even dodecagonal numbers: <code>4*n*(5*n - 2)</code>.
 * @author Sean A. Irvine
 */
public class A193872 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193872() {
    super(new long[] {1, -3, 3}, new long[] {0, 12, 64});
  }
}
