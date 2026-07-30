package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a020.A020483;

/**
 * A086155 a(n) is the number of primes between the primes p = A020483(n) and q = 2n + A020483(n).
 * @author Sean A. Irvine
 */
public class A086155 extends Sequence1 {

  private final Sequence mA = new A020483().skip();
  private long mN = 0;

  @Override
  public Z next() {
    Z p = mA.next();
    final Z q = p.add(2 * ++mN);
    long cnt = -1;
    while (p.compareTo(q) < 0) {
      p = Functions.NEXT_PRIME.z(p);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
