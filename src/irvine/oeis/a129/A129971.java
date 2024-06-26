package irvine.oeis.a129;
// Generated by gen_seq4.pl 2024-04-11/simtraf at 2024-04-11 21:12

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A129971 a(n) = A129968(n)^2.
 * @author Georg Fischer
 */
public class A129971 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A129971() {
    super(1, new A129968(), v -> v.square());
  }
}
