package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000670;

/**
 * A079601 (A000670(2*p - 1) - 1)/(6*p) where p runs through the primes.
 * @author Sean A. Irvine
 */
public class A079601 extends A000040 {

  private final DirectSequence mFubini = new A000670();

  @Override
  public Z next() {
    final Z p = super.next();
    return mFubini.a(p.multiply2().subtract(1)).divide(p.multiply(6));
  }
}
