package irvine.oeis.a128;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A128642 Expansion of <code>(b(q) / b(q^2))^3</code> in powers of q where <code>b()</code> is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A128642 extends EulerTransform {

  /** Construct the sequence. */
  public A128642() {
    super(new PeriodicSequence(-9, 0, -6, 0, -9, 0), 1);
  }
}
