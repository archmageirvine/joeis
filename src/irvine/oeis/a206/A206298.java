package irvine.oeis.a206;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A206298 McKay-Thompson series of class 24C for the Monster group with a(0) = -2.
 * Somos formula: <code>e24C1=ecalc([1, 2;6, 1;8, 2;12, 1;2,-1;3,-2;4,-1;24,-2}]);</code>
 * @author Georg Fischer
 */
public class A206298 extends EulerTransform {

  /** Construct the sequence. */
  public A206298() {
    super(-1, new PeriodicSequence(-2, -1, 0, 0, -2, 0, -2, -2, 0, -1, -2, 0, -2, -1, 0, -2, -2, 0, -2, 0, 0, -1, -2, 0), 1);
  }
}
