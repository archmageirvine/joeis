package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292344 The first Zagreb index of the Aztec diamond <code>AZ(n)</code> (see the Ramanes et al. reference, Theorem <code>2.1)</code>.
 * @author Sean A. Irvine
 */
public class A292344 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292344() {
    super(new long[] {1, -3, 3}, new long[] {68, 212, 420});
  }
}
