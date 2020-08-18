package irvine.oeis.a258;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A258108 Expansion of <code>b(-q) * b(q^6) / (b(q^3) * b(q^12))</code> in powers of q where <code>b()</code> is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A258108 extends EulerTransform {

  /** Construct the sequence. */
  public A258108() {
    super(new PeriodicSequence(3, -6, 5, -3, 3, -4, 3, -3, 4, -6, 3, 1, 3, -6, 5, -3, 3, -4, 3, -3, 5, -6, 3, 1, 3, -6, 4, -3, 3, -4, 3, -3, 5, -6, 3, 0), 1);
  }
}
