package irvine.oeis.a280;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A280328 Expansion of <code>f(-x)^3 * f(-x^2) * chi(-x^3)^3</code> in powers of x where <code>chi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A280328 extends EulerTransform {

  /** Construct the sequence. */
  public A280328() {
    super(new PeriodicSequence(-3, -4, -6, -4, -3, -4), 1);
  }
}
