package irvine.oeis.a014;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-17 18:03
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PeriodicSequence;


/**
 * A014969 Expansion of <code>(theta_3(q) / theta_4(q))^2</code> in powers of q.
 * @author Georg Fischer
 */
public class A014969 extends EulerTransform {

  /** Construct the sequence. */
  public A014969() {
    super(new PeriodicSequence(8, -4, 8, 0), 1);
  }
}
