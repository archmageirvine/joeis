package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051919 Start with n, apply k-&gt;2k+1 until reach new record prime; sequence gives record primes.
 * @author Sean A. Irvine
 */
public class A051919 implements Sequence {

  private Z mP = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    do {
      m = m.multiply2().add(1);
    } while (m.compareTo(mP) <= 0 || !m.isProbablePrime());
    mP = m;
    return mP;
  }
}
