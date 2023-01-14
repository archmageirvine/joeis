package irvine.oeis.a276;

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A276847 Expansion of eta(q^2) * eta(q^4) * eta(q^6) * eta(q^12) in powers of q.
 * @author Georg Fischer
 */
public class A276847 extends EulerTransform {

  /** Construct the sequence. */
  public A276847() {
    super(1, new PeriodicSequence(0, -1, 0, -2, 0, -2, 0, -2, 0, -1, 0, -4), 1);
  }
}
