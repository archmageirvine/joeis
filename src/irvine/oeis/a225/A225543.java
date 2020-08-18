package irvine.oeis.a225;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A225543 G.f.: <code>Product_{k&gt;0} (1 - x^k)^4 * (1 - (-x)^k)^8</code>.
 * @author Georg Fischer
 */
public class A225543 extends EulerTransform {

  /** Construct the sequence. */
  public A225543() {
    super(new PeriodicSequence(4, -20, 4, -12), 1);
  }
}
