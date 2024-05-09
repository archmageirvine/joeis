package irvine.oeis.a069;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A069627 Sum_{k=1..n} floor(n*(n-1)/(2*k)).
 * @author Sean A. Irvine
 */
public class A069627 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final long t = (long) mN * ++mN;
    return Integers.SINGLETON.sum(1, mN, k -> Z.valueOf(t / (2L * k)));
  }
}
