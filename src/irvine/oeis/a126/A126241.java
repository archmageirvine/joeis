package irvine.oeis.a126;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A126241 Dropping time of n in the 3n+1 problem (or the Collatz problem). Let T(n):=n/2 if n is even, (3n+1)/2 otherwise (A014682). Let a(n) be the smallest integer k such that T^(k)(n)&lt;n, where T^(k) is the k-th iterate, or infinity otherwise; a(n) is called the dropping time of n.
 * @author Sean A. Irvine
 */
public class A126241 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  private Z f(final Z n) {
    return n.isEven() ? n.divide2() : n.multiply(3).add(1).divide2();
  }

  @Override
  public Z a(final long n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z a(final Z n) {
    if (n.isOne()) {
      return Z.ZERO;
    }
    long cnt = 0;
    Z t = n;
    do {
      t = f(t);
      ++cnt;
    } while (t.compareTo(n) >= 0);
    return Z.valueOf(cnt);
  }
}
