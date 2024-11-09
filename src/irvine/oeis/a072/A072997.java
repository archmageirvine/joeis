package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072997 Smallest prime p such that Product_{primes q &lt;= p} q+1 &gt;= n*Product_{primes q &lt;= p} q.
 * @author Sean A. Irvine
 */
public class A072997 extends A000040 {

  private Z mA = Z.ONE;
  private Z mB = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    do {
      final Z p = super.next();
      mA = mA.multiply(p);
      mB = mB.multiply(p.add(1));
    } while (mA.multiply(mN).compareTo(mB) > 0);
    return mP;
  }
}

