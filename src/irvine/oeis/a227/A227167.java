package irvine.oeis.a227;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000136;

/**
 * A227167 The number of meandering curves of order n.
 * a(n) = A000136(n) if n is odd and a(n) = (1/2)*A000136(n) if n is even.
 * @author Georg Fischer
 */
public class A227167 extends Sequence1 {

  private int mN = 0;
  private final A000136 mSeq = new A000136();

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? mSeq.next() : mSeq.next().divide2();
  }
}
