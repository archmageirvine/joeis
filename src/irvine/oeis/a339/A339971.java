package irvine.oeis.a339;
// Generated by gen_seq4.pl 2024-04-10/simtraf at 2024-04-10 22:07

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A339971 Odd part of A339821(n).
 * @author Georg Fischer
 */
public class A339971 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A339971() {
    super(0, new A339821(), v -> v.makeOdd());
  }
}
