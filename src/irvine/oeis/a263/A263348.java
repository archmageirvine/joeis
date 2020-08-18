package irvine.oeis.a263;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A263348 Expansion of <code>(eta(q^6) * eta(q^10) / (eta(q) * eta(q^15)))^2</code> in powers of q.
 * @author Georg Fischer
 */
public class A263348 extends EulerTransform {

  /** Construct the sequence. */
  public A263348() {
    super(new PeriodicSequence(2, 2, 2, 2, 2, 0, 2, 2, 2, 0, 2, 0, 2, 2, 4, 2, 2, 0, 2, 0, 2, 2, 2, 0, 2, 2, 2, 2, 2, 0), 1);
  }
}
