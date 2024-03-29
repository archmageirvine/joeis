package irvine.oeis.a208;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A208605 Expansion of q * psi(q^8) / phi(q) in powers of q where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A208605 extends EulerTransform {

  /** Construct the sequence. */
  public A208605() {
    super(1, new PeriodicSequence(-2, 3, -2, 1, -2, 3, -2, 2, -2, 3, -2, 1, -2, 3, -2, 0), 1);
  }
}
