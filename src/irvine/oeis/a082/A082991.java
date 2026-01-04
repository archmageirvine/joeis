package irvine.oeis.a082;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082991 a(1) = 1 and for n &gt; 1, a(n) = 2 * length of the cycle reached for the map x -&gt; A062401(x), starting at n [where A062401(n) = phi(sigma(n))], or -1 if no finite cycle is ever reached.
 * @author Sean A. Irvine
 */
public class A082991 extends Sequence1 {

  private long mN = 0;

  private Z f(final Z n) {
    return Functions.PHI.z(Functions.SIGMA1.z(n));
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z n = Z.valueOf(mN);
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(n)) {
      n = f(n);
    }
    final Z m = n;
    long cnt = 0;
    do {
      n = f(n);
      ++cnt;
    } while (!n.equals(m));
    return Z.valueOf(2 * cnt);
  }
}
