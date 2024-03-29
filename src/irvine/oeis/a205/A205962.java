package irvine.oeis.a205;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A205962 McKay-Thompson series of class 30D for the Monster group with a(0) = 2.
 * Somos formula: <code>e30D=ecalc([2, 1;3, 1;10, 1;15, 1;1,-1;5,-1;6,-1;30,-1}],[1, 2]);</code>
 * @author Georg Fischer
 */
public class A205962 extends EulerTransform {

  /** Construct the sequence. */
  public A205962() {
    super(-1, new PeriodicSequence(2, 0, 0, 0, 4, 0, 2, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 2, 0, 0, 0, 2, 0, 4, 0, 0, 0, 2, 0), 1);
  }
}
