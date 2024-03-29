package irvine.oeis.a227;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A227454 Expansion of q * (f(q^9) / f(q))^3 in powers of q where f() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A227454 extends EulerTransform {

  /** Construct the sequence. */
  public A227454() {
    super(1, new PeriodicSequence(-3, 6, -3, 3, -3, 6, -3, 3, 0, 6, -3, 3, -3, 6, -3, 3, -3, 0, -3, 3, -3, 6, -3, 3, -3, 6, 0, 3, -3, 6, -3, 3, -3, 6, -3, 0), 1);
  }
}
