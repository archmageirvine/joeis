package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195162 Generalized 12-gonal numbers: k*(5*k-4) for k <code>= 0, +-1, +-2, </code>...
 * @author Sean A. Irvine
 */
public class A195162 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195162() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 9, 12, 28});
  }
}
