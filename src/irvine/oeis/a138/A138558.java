package irvine.oeis.a138;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A138558 Expansion of eta(q^2)^7 * eta(q^5)^2 * eta(q^20)^2 / (eta(q)^2 * eta(q^4)^2 * eta(q^10)^3) in powers of q.
 * @author Georg Fischer
 */
public class A138558 extends EulerTransform {

  /** Construct the sequence. */
  public A138558() {
    super(1, new PeriodicSequence(2, -5, 2, -3, 0, -5, 2, -3, 2, -4, 2, -3, 2, -5, 0, -3, 2, -5, 2, -4), 1);
  }
}
