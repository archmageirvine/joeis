package irvine.oeis.a245;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A245669 Expansion of q <code>* f(q, q^5)^3</code> in powers of q where <code>f()</code> is Ramanujan's two-variable theta function.
 * @author Georg Fischer
 */
public class A245669 extends EulerTransform {

  /** Construct the sequence. */
  public A245669() {
    super(new PeriodicSequence(3, -3, 0, 0, 3, -3, 3, 0, 0, -3, 3, -3), 1);
  }
}
