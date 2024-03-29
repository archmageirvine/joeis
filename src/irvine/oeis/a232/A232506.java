package irvine.oeis.a232;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A232506 Expansion of (eta(q) * eta(q^23))^2 in powers of q.
 * @author Georg Fischer
 */
public class A232506 extends EulerTransform {

  /** Construct the sequence. */
  public A232506() {
    super(2, new PeriodicSequence(-2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -2, -4), 1);
  }
}
