package irvine.oeis.a260;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A260945 Expansion of <code>(2*b(q^4) - b(q) - b(q^2)) / 3</code> in powers of q where <code>b()</code> is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A260945 extends EulerTransform {

  /** Construct the sequence. */
  public A260945() {
    super(new PeriodicSequence(1, -3, 1, -2, 1, -2, 1, -2, 0, -3, 1, -1, 1, -3, 1, -2, 1, -2, 1, -2, 1, -3, 1, -1, 1, -3, 0, -2, 1, -2, 1, -2, 1, -3, 1, -2), 0, 1);
  }
}
