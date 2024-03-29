package irvine.oeis.a128;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A128638 Expansion of q * (psi(q^3)^3 / psi(q)) / (phi(-q)^3 / phi(-q^3)) in powers of q where phi(), psi() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A128638 extends EulerTransform {

  /** Construct the sequence. */
  public A128638() {
    super(1, new PeriodicSequence(5, 4, 6, 4, 5, 0), 1);
  }
}
