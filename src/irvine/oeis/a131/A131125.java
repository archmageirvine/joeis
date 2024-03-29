package irvine.oeis.a131;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A131125 McKay-Thompson series of class 8E for the Monster group with a(0) = 4.
 * Somos formula: <code>e8E3=ecalc([2, 5;1,-2;4,-1;8,-2}],[1, 2], 2);</code>
 * @author Georg Fischer
 */
public class A131125 extends EulerTransform {

  /** Construct the sequence. */
  public A131125() {
    super(-1, new PeriodicSequence(4, -6, 4, -4, 4, -6, 4, 0), 1);
  }
}
