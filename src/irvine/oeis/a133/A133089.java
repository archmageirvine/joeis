package irvine.oeis.a133;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A133089 Expansion of <code>f(x)^3</code> in powers of x where <code>f()</code> is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A133089 extends EulerTransform {

  /** Construct the sequence. */
  public A133089() {
    super(new PeriodicSequence(3, -6, 3, -3), 1);
  }
}
