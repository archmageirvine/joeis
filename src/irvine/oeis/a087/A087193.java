package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a018.A018901;

/**
 * A087193 H(p)/p where p runs through the primes and H(k) is the k-th central hexanomial coefficient (A018901).
 * @author Sean A. Irvine
 */
public class A087193 extends A000040 {

  private final DirectSequence mA = new A018901();

  @Override
  public Z next() {
    final Z p = super.next();
    return mA.a(p).divide(p);
  }
}
