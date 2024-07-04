package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000203;

/**
 * A071170 n-th prime reduced modulo sigma(n).
 * @author Georg Fischer
 */
public class A071170 extends A000040 {

  private final Sequence mSigma = new A000203();

  @Override
  public Z next() {
    return super.next().mod(mSigma.next());
  }
}
