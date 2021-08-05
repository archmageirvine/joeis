package irvine.oeis.a217;
// manually (bindec) at 2021-08-04 22:08

import irvine.oeis.BinaryToDecimalExpansionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a101.A101264;

/**
 * A217054 Odd number version of the prime constant (A101264 interpreted as a binary number).
 * @author Georg Fischer
 */
public class A217054 extends BinaryToDecimalExpansionSequence {

  /** Construct the sequence */
  public A217054() {
    super(new SkipSequence(new A101264(), 1));
  }
}
