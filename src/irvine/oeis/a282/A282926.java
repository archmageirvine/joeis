package irvine.oeis.a282;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A282926 Expansion of Product_{k&gt;=1} (1 - x^(7*k))^32/(1 - x^k)^33 in powers of x.
 * @author Georg Fischer
 */
public class A282926 extends EulerTransform {

  /** Construct the sequence. */
  public A282926() {
    super(new PaddingSequence(new long[] {  }, new long[] {33, 33, 33, 33, 33, 33, 1}), 1);
  }
}
