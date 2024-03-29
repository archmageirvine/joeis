package irvine.oeis.a138;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A138501 Expansion of (eta(q)^2 * eta(q^4)^4 / eta(q^2)^3)^2 in powers of q.
 * @author Georg Fischer
 */
public class A138501 extends EulerTransform {

  /** Construct the sequence. */
  public A138501() {
    super(1, new PeriodicSequence(-4, 2, -4, -6), 1);
  }
}
