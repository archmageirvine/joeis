package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017613 (12n+7)^9.
 * @author Sean A. Irvine
 */
public class A017613 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017613() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {40353607, 322687697779L, 26439622160671L, 502592611936843L, 4605366583984375L, 27206534396294947L, 119851595982618319L, 427929800129788411L, 1304773183829244583L, 3517876291919921875L});
  }
}
