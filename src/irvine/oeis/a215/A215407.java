package irvine.oeis.a215;
// Generated by gen_seq4.pl eulerxfm -1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A215407 McKay-Thompson series of class <code>18B</code> for the Monster group with <code>a(0) = 2</code>.
 * @author Georg Fischer
 */
public class A215407 extends EulerTransform {

  /** Construct the sequence. */
  public A215407() {
    super(new PeriodicSequence(2, 4, -2, 4, 2, -4, 2, 4, 0, 4, 2, -4, 2, 4, -2, 4, 2, 0), 1);
  }
}
