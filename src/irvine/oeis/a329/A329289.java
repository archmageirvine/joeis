package irvine.oeis.a329;
// manually anopsn 0, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a036.A036469;

/**
 * A329289 G.f.: (1 + x) * (1 + x^2) * Product_{k&gt;=1} (1 + x^k).
 * @author Georg Fischer
 */
public class A329289 extends AbstractSequence {

  private final A036469 mSeq1 = new A036469();
  private Z mP4 = Z.ZERO;
  private Z mP3 = Z.ZERO;
  private Z mP2 = Z.ZERO;
  private Z mP1 = Z.ZERO;

  /** Construct the sequence. */
  public A329289() {
    super(0);
  }

  @Override
  public Z next() {
    // a(n) = A036469(n) - A036469(n-4).
    final Z p0 = mSeq1.next();
    final Z result = p0.subtract(mP4);
    mP4 = mP3;
    mP3 = mP2;
    mP2 = mP1;
    mP1 = p0;
    return result;
  }
}
