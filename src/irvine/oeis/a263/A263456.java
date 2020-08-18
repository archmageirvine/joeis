package irvine.oeis.a263;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A263456 Expansion of <code>phi(-q) * f(-q^8)^3 / f(-q^24)</code> in powers of q where <code>phi(), f()</code> are Ramanujan theta functions.
 * @author Georg Fischer
 */
public class A263456 extends EulerTransform {

  /** Construct the sequence. */
  public A263456() {
    super(new PeriodicSequence(-2, -1, -2, -1, -2, -1, -2, -4, -2, -1, -2, -1, -2, -1, -2, -4, -2, -1, -2, -1, -2, -1, -2, -3), 1);
  }
}
