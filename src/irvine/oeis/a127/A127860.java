package irvine.oeis.a127;
// Generated by gen_seq4.pl tuptraf/simtraf at 2023-10-28 00:07

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A127860 a(n) = A127858(n)^2.
 * @author Georg Fischer
 */
public class A127860 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A127860() {
    super(1, new A127858(), v -> v.square());
  }
}
