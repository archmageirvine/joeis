package irvine.oeis.a187;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A187130 McKay-Thompson series of class 12I for the Monster group with a(0) = -3.
 * Somos formula: <code>e12I4=ecalc([1, 3;4, 1;6, 2;2,-2;3,-1;12,-3}],, 2);</code>
 * @author Georg Fischer
 */
public class A187130 extends EulerTransform {

  /** Construct the sequence. */
  public A187130() {
    super(-1, new PeriodicSequence(-3, -1, -2, -2, -3, -2, -3, -2, -2, -1, -3, 0), 1);
  }
}
