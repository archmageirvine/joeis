package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000720 <code>pi(n)</code>, the number of primes <code>&lt;= n</code>. Sometimes called <code>PrimePi(n)</code> to distinguish it from the number <code>3.14159</code>...
 * @author Sean A. Irvine
 */
public class A000720 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.isPrime()) {
      mP = mP.add(1);
    }
    return mP;
  }
}
