package irvine.oeis.a249;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A249371 Expansion of q^3 * f(q) * f(-q^4) * f(q^15) * f(-q^60) * chi(-q^3) * chi(-q^5) in powers of q where chi(), f() are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A249371 extends EulerTransform {

  /** Construct the sequence. */
  public A249371() {
    super(3, new PeriodicSequence(1, -2, 0, -2, 0, -2, 1, -2, 0, -2, 1, -2, 1, -2, 0, -2, 1, -2, 1, -2, 0, -2, 1, -2, 0, -2, 0, -2, 1, -4), 1);
  }
}
