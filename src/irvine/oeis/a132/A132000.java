package irvine.oeis.a132;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A132000 Expansion of <code>(1/3) * b(q) * b(q^2) * c(q)^2 / c(q^2)</code> in powers of q where <code>b(), c()</code> are cubic AGM functions.
 * @author Georg Fischer
 */
public class A132000 extends EulerTransform {

  /** Construct the sequence. */
  public A132000() {
    super(new PeriodicSequence(-1, -5, -6, -5, -1, -6), 1);
  }
}
