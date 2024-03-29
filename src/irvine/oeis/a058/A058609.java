package irvine.oeis.a058;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A058609 McKay-Thompson series of class 28D for Monster.
 * Somos formula: <code>e28D=ecalc([2, 1;7, 1;1,-1;14,-1}],[2, 2]);</code>
 * @author Georg Fischer
 */
public class A058609 extends EulerTransform {

  /** Construct the sequence. */
  public A058609() {
    super(-1, new PeriodicSequence(2, 0, 2, 0, 2, 0, 0, 0, 2, 0, 2, 0, 2, 0), 1);
  }
}
