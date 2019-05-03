package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214580 The hyper-Wiener index of the circumcoronene <code>H(n)</code> (see definition in the Klavzar papers).
 * @author Sean A. Irvine
 */
public class A214580 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214580() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {42, 2697, 29805, 163914, 616008, 1819539, 4550763});
  }
}
