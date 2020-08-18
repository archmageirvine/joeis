package irvine.oeis.a069;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A069911 Expansion of <code>Product_{i</code> in <code>A069909} 1/(1 - x^i)</code>.
 * @author Georg Fischer
 */
public class A069911 extends EulerTransform {

  /** Construct the sequence. */
  public A069911() {
    super(new PeriodicSequence(1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0), 1);
  }
}
