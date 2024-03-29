package irvine.oeis.a121;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A121592 Expansion of (eta(q)eta(q^9)/eta(q^3)^2)^6 in powers of q.
 * @author Georg Fischer
 */
public class A121592 extends EulerTransform {

  /** Construct the sequence. */
  public A121592() {
    super(1, new PeriodicSequence(-6, -6, 6, -6, -6, 6, -6, -6, 0), 1);
  }
}
