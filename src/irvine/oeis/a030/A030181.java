package irvine.oeis.a030;
// generated by patch_offset.pl at 2023-01-14 12:23

import irvine.oeis.recur.PeriodicSequence;
import irvine.oeis.transform.EulerTransform;

/**
 * A030181 Expansion of (eta(q) / eta(q^7))^4 in powers of q.
 * Somos formula: <code>e7B=ecalc([1, 1;7,-1}],[1, 4]);</code>
 * @author Georg Fischer
 */
public class A030181 extends EulerTransform {

  /** Construct the sequence. */
  public A030181() {
    super(-1, new PeriodicSequence(-4, -4, -4, -4, -4, -4, 0), 1);
  }
}
