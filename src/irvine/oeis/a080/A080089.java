package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a078.A078908;

/**
 * A080089 Let r+i*s be the sum of the first-quadrant Gaussian primes dividing prime(n); sequence gives s values.
 * @author Sean A. Irvine
 */
public class A080089 extends A000040 {

  private final DirectSequence mA = new A078908() {
    @Override
    protected Z select(final Zi n) {
      return n.im();
    }
  };

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}

