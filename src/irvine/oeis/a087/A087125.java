package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087125 Indices k of hex numbers H(k) that are also triangular.
 * @author Sean A. Irvine
 */
public class A087125 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087125() {
    super(new long[] {1, -11, 11}, new long[] {0, 5, 54});
  }
}
