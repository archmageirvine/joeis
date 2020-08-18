package irvine.oeis.a330;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.FiniteSequence;


/**
 * A330033 <code>a(n) = Kronecker(n, 5) * (-1)^floor(n/5)</code>.
 * @author Georg Fischer
 */
public class A330033 extends EulerTransform {

  /** Construct the sequence. */
  public A330033() {
    super(new FiniteSequence(-1, -1, 0, 0, -1, 0, 0, 0, 0, 1), 0, 1);
  }
}
