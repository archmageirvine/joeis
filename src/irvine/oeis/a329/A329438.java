package irvine.oeis.a329;
// Generated by gen_seq4.pl 2025-01-01.ack/moetrafi at 2025-01-01 23:25

import irvine.oeis.a000.A000586;
import irvine.oeis.transform.InverseMobiusTransformSequence;

/**
 * A329438 Expansion of Sum_{k&gt;=1} (-1 + Product_{j&gt;=1} (1 + x^(k*prime(j)))).
 * @author Georg Fischer
 */
public class A329438 extends InverseMobiusTransformSequence {

  /** Construct the sequence. */
  public A329438() {
    super(1, new A000586(), 1);
    next();
  }
}
