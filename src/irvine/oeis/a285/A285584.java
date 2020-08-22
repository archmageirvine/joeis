package irvine.oeis.a285;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A285584 Expansion of r(q^4) / r(q)^4 in powers of q where r() is the Rogers-Ramanujan continued fraction.
 * @author Georg Fischer
 */
public class A285584 extends EulerTransform {

  /** Construct the sequence. */
  public A285584() {
    super(new PaddingSequence(new long[] {  }, new long[] {4, -4, -4, 3, 0, 4, -4, -3, 4, 0, 4, -3, -4, 4, 0, 3, -4, -4, 4, 0}), 1);
  }
}
