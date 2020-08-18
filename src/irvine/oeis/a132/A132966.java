package irvine.oeis.a132;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A132966 Expansion of <code>f(-x) * chi(x^2)^2</code> in powers of x where <code>f(), chi()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A132966 extends EulerTransform {

  /** Construct the sequence. */
  public A132966() {
    super(new PeriodicSequence(-1, 1, -1, -3, -1, 1, -1, -1), 1);
  }
}
