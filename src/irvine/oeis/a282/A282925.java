package irvine.oeis.a282;
// Generated by gen_seq4.pl eulerxfm 0 at 2020-08-22 22:46
// DO NOT EDIT here!

import irvine.oeis.EulerTransform;
import irvine.oeis.PaddingSequence;


/**
 * A282925 Expansion of Product_{k&gt;=1} (1 - x^(7*k))^28/(1 - x^k)^29 in powers of x.
 * @author Georg Fischer
 */
public class A282925 extends EulerTransform {

  /** Construct the sequence. */
  public A282925() {
    super(new PaddingSequence(new long[] {  }, new long[] {29, 29, 29, 29, 29, 29, 1}), 1);
  }
}
