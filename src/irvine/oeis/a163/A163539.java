package irvine.oeis.a163;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a059.A059252;

/**
 * A163539 The change in Y-coordinate when moving from the n-1:th to the n-th term in the type I Hilbert's Hamiltonian walk A163357.
 * @author Georg Fischer
 */
public class A163539 extends AbstractSequence {

  private final A059252 mSeq1 = new A059252();
  private Z mA;

  /** Construct the sequence. */
  public A163539() {
    super(0);
    mA = Z.ZERO;
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
