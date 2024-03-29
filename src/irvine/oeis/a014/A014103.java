package irvine.oeis.a014;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A014103 Expansion of (eta(q^2) / eta(q))^24 in powers of q.
 * @author Georg Fischer
 */
public class A014103 extends EulerTransform {

  /** Construct the sequence. */
  public A014103() {
    super(1, new PeriodicSequence(24, 0, 24, 0), 1);
  }
}
