package irvine.oeis.a259;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a052.A052291;

/**
 * A259021 Numbers k such that k^2 = Product_{d|k} d (= A007955(k)) and simultaneously k^2 + 1 is a divisorial prime (A258455).
 * @author Georg Fischer
 */
public class A259021 extends AbstractSequence {

  private int mN = 0;
  private final A052291 mSeq = new A052291();

  /** Construct the sequence. */
  public A259021() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.TWO.multiply(mSeq.next());
    return (mN == 1) ? Z.ONE : result;
  }
}
