package irvine.oeis.a112;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A112848 Expansion of eta(q)*eta(q^2)*eta(q^18)^2/(eta(q^6)*eta(q^9)) in powers of q.
 * @author Georg Fischer
 */
public class A112848 extends EulerTransform {

  /** Construct the sequence. */
  public A112848() {
    super(1, new PeriodicSequence(-1, -2, -1, -2, -1, -1, -1, -2, 0, -2, -1, -1, -1, -2, -1, -2, -1, -2), 1);
  }
}
