package irvine.oeis.a246;

import irvine.oeis.LinearRecurrence;

/**
 * A246642 Sequence appearing in the curvature of a certain four circle touching problem: (-3 + 5*A007805(n))/2.
 * @author Sean A. Irvine
 */
public class A246642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246642() {
    super(new long[] {1, -19, 19}, new long[] {1, 41, 761});
  }
}
