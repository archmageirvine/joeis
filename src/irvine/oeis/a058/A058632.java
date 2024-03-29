package irvine.oeis.a058;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A058632 Coefficients of replicable function number "32b".
 * Somos formula: <code>e32b=ecalc([2, 1;4, 1;1,-1;8,-1}],[4, 2]);</code>
 * @author Georg Fischer
 */
public class A058632 extends EulerTransform {

  /** Construct the sequence. */
  public A058632() {
    super(-1, new PeriodicSequence(2, 0, 2, -2, 2, 0, 2, 0), 1);
  }
}
