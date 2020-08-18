package irvine.oeis.a244;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A244375 Expansion of <code>(a(q) + 3*a(q^2) - 4*a(q^4)) / 6</code> in powers of q where <code>a()</code> is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A244375 extends EulerTransform {

  /** Construct the sequence. */
  public A244375() {
    super(new PeriodicSequence(3, -5, 2, -1, 3, -2, 3, -1, 2, -5, 3, -2), 1);
  }
}
