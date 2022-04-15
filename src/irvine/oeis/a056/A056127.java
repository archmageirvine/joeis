package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A056127 Minimum m where product_{k=1 to m}[p_k] &gt; (p_{m+1})^n, where p_k is k-th prime.
 * @author Sean A. Irvine
 */
public class A056127 extends A002110 {

  private long mN = -1;
  private long mM = 0;
  private Z mPrimorial = super.next();

  @Override
  public Z next() {
    Z t = Z.valueOf(mPrime.nextPrime(mP)).pow(++mN);
    while (mPrimorial.compareTo(t) <= 0) {
      mPrimorial = super.next();
      ++mM;
      t = Z.valueOf(mPrime.nextPrime(mP)).pow(mN);
    }
    return Z.valueOf(mM);
  }
}
