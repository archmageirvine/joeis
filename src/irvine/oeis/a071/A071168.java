package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a000.A000040;

/**
 * A071168 n-th prime reduced modulo phi(n).
 * @author Georg Fischer
 */
public class A071168 extends A000040 {

  private final Sequence mPhi = new A000010();

  @Override
  public Z next() {
    return super.next().mod(mPhi.next());
  }
}
