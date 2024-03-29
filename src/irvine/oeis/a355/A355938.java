package irvine.oeis.a355;
// Generated by patch_prepend.pl 2023-06-19 07:19

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.PrependSequence;
import irvine.oeis.a055.A055638;

/**
 * A355938 a(n) = 1 if sigma(n^2) is a noncomposite, otherwise 0.
 * @author Georg Fischer
 */
public class A355938 extends CharacteristicFunction {

  /** Construct the sequence. */
  public A355938() {
    super(1, new PrependSequence(new A055638(), 1), true, 4);
  }
}
