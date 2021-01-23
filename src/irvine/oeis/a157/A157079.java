package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157079 32805000n^2 - 10513800n + 842401.
 * @author Sean A. Irvine
 */
public class A157079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157079() {
    super(new long[] {1, -3, 3}, new long[] {23133601, 111034801, 264546001});
  }
}
