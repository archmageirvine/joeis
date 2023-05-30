package irvine.oeis.a229;
// manually 2023-05-29

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A229894 Expansion of q^2 * eta(q) / eta(q^49) in powers of q.
 * @author Georg Fischer
 */
public class A229894 extends EulerTransform {

  /** Construct the sequence. */
  public A229894() {
    super(0, new PeriodicSequence(-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
      -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0), 1);
  }
}
