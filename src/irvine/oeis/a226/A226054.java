package irvine.oeis.a226;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A226054 McKay-Thompson series of class <code>45A</code> for the Monster group with <code>a(0) = 1</code>.
 * @author Georg Fischer
 */
public class A226054 extends EulerTransform {

  /** Construct the sequence. */
  public A226054() {
    super(new PeriodicSequence(1, 1, -1, 1, 2, -1, 1, 1, 0, 2, 1, -1, 1, 1, -2, 1, 1, 0, 1, 2, -1, 1, 1, -1, 2, 1, 0, 1, 1, -2, 1, 1, -1, 1, 2, 0, 1, 1, -1, 2, 1, -1, 1, 1, 0), 1);
  }
}
