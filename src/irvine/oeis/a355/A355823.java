package irvine.oeis.a355;
// manually 2024-06-23

import irvine.math.z.Z;
import irvine.oeis.CharacteristicFunction;
import irvine.oeis.DirectSequence;
import irvine.oeis.a138.A138302;

/**
 * A355823 a(n) = 1 if all exponents in prime factorization of n are powers of 2, otherwise 0.
 * @author Georg Fischer
 */
public class A355823 extends CharacteristicFunction implements DirectSequence {

  private final A138302 mSeq = new A138302();

  /** Construct the sequence. */
  public A355823() {
    super(1, new A138302());
  }

  @Override
  public Z a(final Z n) {
    return mSeq.is(n) ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z a(final int n) {
    return mSeq.is(n) ? Z.ONE : Z.ZERO;
  }

}
