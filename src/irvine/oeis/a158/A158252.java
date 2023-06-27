package irvine.oeis.a158;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A158252 289n^2 - 2n.
 * @author Sean A. Irvine
 */
public class A158252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158252() {
    super(1, new long[] {1, -3, 3}, new long[] {287, 1152, 2595});
  }
}
