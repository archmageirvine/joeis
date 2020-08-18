package irvine.oeis.a263;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A263773 Expansion of <code>b(-q)^2</code> in powers of q where <code>b()</code> is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A263773 extends EulerTransform {

  /** Construct the sequence. */
  public A263773() {
    super(new PeriodicSequence(6, -12, 4, -6, 6, -8, 6, -6, 4, -12, 6, -4), 1);
  }
}
