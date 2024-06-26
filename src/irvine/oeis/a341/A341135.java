package irvine.oeis.a341;
// Generated by gen_seq4.pl 2024-04-29/ordsum at 2024-04-29 22:09

import irvine.oeis.a010.A010055;
import irvine.oeis.transform.RootSequence;

/**
 * A341135 Number of ways to write n as an ordered sum of 6 prime powers (including 1).
 * @author Georg Fischer
 */
public class A341135 extends RootSequence {

  /** Construct the sequence. */
  public A341135() {
    super(6, new A010055().skip(1), 6, 1);
  }
}
