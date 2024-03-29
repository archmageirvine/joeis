package irvine.oeis.a128;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A128512 Expansion of q^(-1) * (chi(-q) * chi(-q^9) / chi(-q^3)^2)^6 in powers of q where chi() is a Ramanujan theta function.
 * Somos formula: <code>e18z=ecalc([1, 1;6, 2;9, 1;2,-1;3,-2;18,-1}],[1, 6]);</code>
 * @author Georg Fischer
 */
public class A128512 extends EulerTransform {

  /** Construct the sequence. */
  public A128512() {
    super(-1, new PeriodicSequence(-6, 0, 6, 0, -6, 0, -6, 0, 0, 0, -6, 0, -6, 0, 6, 0, -6, 0), 1);
  }
}
