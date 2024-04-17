package irvine.oeis.a069;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A069257 Denominator of the last term of the Egyptian fraction sum (using the greedy algorithm) which satisfies 1 = 1/n + 1/(n+1) + 1/(n+2) ... 1/a(n).
 * @author Sean A. Irvine
 */
public class A069257 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    Z k = Z.valueOf(++mN);
    Q s = new Q(1, mN);
    while (s.compareTo(Q.ONE) < 0) {
      k = k.add(1).max(Q.ONE.subtract(s).reciprocal().ceiling());
      s = s.add(new Q(Z.ONE, k));
    }
    return k;
  }
}
