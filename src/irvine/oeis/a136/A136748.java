package irvine.oeis.a136;
// Generated by gen_seq4.pl eulerxfm 1 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A136748 Expansion of <code>(a(q) - a(q^2) - 4*a(q^4) + 4*a(q^8)) / 6</code> in powers of q where <code>a()</code> is a cubic AGM theta function.
 * @author Georg Fischer
 */
public class A136748 extends EulerTransform {

  /** Construct the sequence. */
  public A136748() {
    super(new PeriodicSequence(-1, 1, -2, -3, -1, 0, -1, -1, -2, 1, -1, -2, -1, 1, -2, -1, -1, 0, -1, -3, -2, 1, -1, -2), 1);
  }
}
