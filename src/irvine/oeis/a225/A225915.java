package irvine.oeis.a225;
// Generated by gen_seq4.pl eulerxfm 2 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A225915 Expansion of <code>(k(q) / 4)^4</code> in powers of q where <code>k()</code> is a Jacobi elliptic function.
 * @author Georg Fischer
 */
public class A225915 extends EulerTransform {

  /** Construct the sequence. */
  public A225915() {
    super(new PeriodicSequence(-16, 32, -16, 0), 1);
  }
}
