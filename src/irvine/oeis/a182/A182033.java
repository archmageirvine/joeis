package irvine.oeis.a182;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A182033 Expansion of <code>c(q^2)^2 / (c(q) * c(q^6))</code> in powers of q where <code>c()</code> is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A182033 extends EulerTransform {

  /** Construct the sequence. */
  public A182033() {
    super(new PeriodicSequence(-1, 1, 2, 1, -1, -3, -1, 1, 2, 1, -1, -3, -1, 1, 2, 1, -1, 0), 1);
  }
}
