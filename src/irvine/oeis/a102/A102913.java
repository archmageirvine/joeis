package irvine.oeis.a102;
// manually (bindec) at 2021-08-04

import irvine.oeis.BinaryToDecimalExpansionSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a064.A064911;

/**
 * A102913 Take characteristic function of the semiprimes A001358, interpret it as a binary fraction and convert to a decimal fraction.
 * @author Georg Fischer
 */
public class A102913 extends BinaryToDecimalExpansionSequence {

  /** Construct the sequence */
  public A102913() {
    super(new PrependSequence(new A064911(), 0));
  }
}
