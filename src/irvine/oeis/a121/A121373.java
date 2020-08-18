package irvine.oeis.a121;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A121373 Expansion of <code>f(x) = f(x, -x^2)</code> in powers of x where <code>f(, )</code> is Ramanujan's general theta function.
 * @author Georg Fischer
 */
public class A121373 extends EulerTransform {

  /** Construct the sequence. */
  public A121373() {
    super(new PeriodicSequence(1, -2, 1, -1), 1);
  }
}
