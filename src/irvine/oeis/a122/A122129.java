package irvine.oeis.a122;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A122129 Expansion of <code>1 + Sum_{k&gt;0} x^k^2/((1-x)(1-x^2)...(1-x^(2k)))</code>.
 * @author Georg Fischer
 */
public class A122129 extends EulerTransform {

  /** Construct the sequence. */
  public A122129() {
    super(new PeriodicSequence(1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0), 1);
  }
}
