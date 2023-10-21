package irvine.oeis.a245;
// manually 2023-10-17

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A245421 Expansion of q^(-1) * f(-q^2, -q^7) * f(-q^4, -q^5) / f(-q, -q^8)^2
 * in powers of q where f() is Ramanujan's two-variable theta function.
 * @author Georg Fischer
 */
public class A245421 extends EulerTransform {

  /** Construct the sequence. */
  public A245421() {
    super(-1, new PeriodicSequence(new long[] { 2, -1, 0, -1, -1, 0, -1, 2, 0 }), 1);
  }
}
