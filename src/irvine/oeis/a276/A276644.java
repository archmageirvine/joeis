package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276644 Self-composition of the repunits; g.f.: <code>A(x) = G(G(x))</code>, where <code>G(x) =</code> g.f. of <code>A002275</code>.
 * @author Sean A. Irvine
 */
public class A276644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276644() {
    super(new long[] {-100, 330, -272, 33}, new long[] {0, 1, 22, 464});
  }
}
