package irvine.oeis.a280;
// Generated by gen_seq4.pl 2024-05-08/invtrac at 2024-05-08 21:31

import irvine.oeis.CharacteristicFunction;
import irvine.oeis.a000.A000041;
import irvine.oeis.transform.InvertTransform;

/**
 * A280254 Expansion of 1/(1 - Sum_{k&gt;=1} x^p(k)), where p(k) is the number of partitions of k (A000041).
 * @author Georg Fischer
 */
public class A280254 extends InvertTransform {

  /** Construct the sequence. */
  public A280254() {
    super(0, new CharacteristicFunction(0, new A000041()), 0);
  }
}
