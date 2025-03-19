package irvine.oeis.a076;

import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A076076 Primes associated with groups in A076077.
 * @author Sean A. Irvine
 */
public class A076076 extends A076077 {

  private int mN = -1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(0, ++mN, k -> super.next());
  }
}
