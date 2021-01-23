package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292343 The PI index of the Aztec diamond AZ(n) (see the Imran et al. reference).
 * @author Sean A. Irvine
 */
public class A292343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292343() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {108, 888, 3268, 8560, 18460});
  }
}
