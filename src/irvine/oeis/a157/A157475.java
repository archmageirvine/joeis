package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157475 <code>512n + 16</code>.
 * @author Sean A. Irvine
 */
public class A157475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157475() {
    super(new long[] {-1, 2}, new long[] {528, 1040});
  }
}
