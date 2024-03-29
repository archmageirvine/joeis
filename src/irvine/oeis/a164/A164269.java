package irvine.oeis.a164;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A164269 Expansion of q * f(q^9)^3 * phi(q) / (f(q^3) * phi(q^3)^3) in powers of q where f(), phi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A164269 extends EulerTransform {

  /** Construct the sequence. */
  public A164269() {
    super(1, new PeriodicSequence(2, -3, -5, -1, 2, 8, 2, -1, -2, -3, 2, 3, 2, -3, -5, -1, 2, 2, 2, -1, -5, -3, 2, 3, 2, -3, -2, -1, 2, 8, 2, -1, -5, -3, 2, 0), 1);
  }
}
