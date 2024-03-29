package irvine.oeis.a187;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A187100 Expansion of q * (psi(-q^3) * psi(q^6)) / (psi(-q) * phi(-q)) in powers of q where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A187100 extends EulerTransform {

  /** Construct the sequence. */
  public A187100() {
    super(1, new PeriodicSequence(3, 1, 2, 2, 3, 2, 3, 2, 2, 1, 3, 0), 1);
  }
}
