package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007814;

/**
 * A065916 Denominator of sigma(8*n^2)/sigma(4*n^2).
 * <code>a(n) = 2^s-1, with s = 2*A007814(n) + 3</code>
 * @author Georg Fischer
 */
public class A065916 extends Sequence1 {

  private final A007814 mSeq = new A007814();

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mSeq.next().intValue() * 2 + 3).subtract(Z.ONE);
  }
}
