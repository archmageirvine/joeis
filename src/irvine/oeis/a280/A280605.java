package irvine.oeis.a280;
// Generated by gen_seq4.pl 2024-05-08/invtrac at 2024-05-08 21:31

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a246.A246547;
import irvine.oeis.transform.InvertTransform;

/**
 * A280605 Expansion of 1/(1 - Sum_{p prime, k&gt;=2} x^(p^k)).
 * @author Georg Fischer
 */
public class A280605 extends InvertTransform {

  /** Construct the sequence. */
  public A280605() {
    super(0, new CharacteristicFunction(0, new A246547()), 0);
  }
}
