package irvine.oeis.a214;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A214035 McKay-Thompson series of class <code>16C</code> for the Monster group with <code>a(0) = 4</code>.
 * @author Georg Fischer
 */
public class A214035 extends EulerTransform {

  /** Construct the sequence. */
  public A214035() {
    super(new PeriodicSequence(4, -2, 4, 2, 4, -2, 4, -4, 4, -2, 4, 2, 4, -2, 4, 0), 1);
  }
}
