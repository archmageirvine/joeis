package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a038.A038664;

/**
 * A066493 a(n) = least k such that f(k) = n, where f is the prime gaps function given by f(m) = prime(m+1)-prime(m) and prime(m) denotes the m-th prime, if k exists; 0 otherwise.
 * @author Sean A. Irvine
 */
public class A066493 extends Sequence1 {

  private final Sequence mA = new A038664();
  private long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 1) == 1) {
      return mN == 1 ? Z.ONE : Z.ZERO;
    }
    return mA.next();
  }
}
