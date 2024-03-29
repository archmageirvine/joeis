package irvine.oeis.a187;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A187147 McKay-Thompson series of class 12B for the Monster group with a(0) = -4.
 * Somos formula: <code>e12B2=ecalc([1, 1;4, 1;6, 1;2,-1;3,-1;12,-1}],[1, 4]);</code>
 * @author Georg Fischer
 */
public class A187147 extends EulerTransform {

  /** Construct the sequence. */
  public A187147() {
    super(-1, new PeriodicSequence(-4, 0, 0, -4, -4, 0, -4, -4, 0, 0, -4, 0), 1);
  }
}
