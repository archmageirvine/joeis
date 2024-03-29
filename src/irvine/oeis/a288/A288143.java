package irvine.oeis.a288;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A288143 Expansion of x * phi(x) * phi(x^3)^2 * f(x, x^5)^3 in powers of x where phi() is a Ramanujan theta function and f(, ) is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A288143 extends EulerTransform {

  /** Construct the sequence. */
  public A288143() {
    super(1, new PeriodicSequence(5, -6, 6, -1, 5, -12, 5, -1, 6, -6, 5, -6), 1);
  }
}
