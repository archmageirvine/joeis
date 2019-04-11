package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000705;

/**
 * A002201 Superior highly composite numbers: positive integers n for which there is <code>an</code> e <code>&gt; 0</code> such that d(n)/n^e <code>&gt;=</code> d(k)/k^e for all k <code>&gt; 1,</code> where the function d(n) counts the divisors of n (A000005).
 * @author Sean A. Irvine
 */
public class A002201 extends A000705 {

  private Z mP = Z.ONE;

  @Override
  public Z next() {
    mP = mP.multiply(super.next());
    return mP;
  }
}
