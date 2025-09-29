package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A080694 Let u(1)=u(2)=1 and u(k)=abs(u(k-1)-u(k-2)-n); sequence gives length of period of u(k).
 * @author Sean A. Irvine
 */
public class A080694 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z u = Z.ONE;
    Z v = Z.ONE;
    final HashSet<Pair<Z, Z>> s = new HashSet<>();
    while (s.add(new Pair<>(u, v))) {
      final Z t = v.subtract(u).subtract(mN).abs();
      u = v;
      v = t;
    }
    final Z x = u;
    final Z y = v;
    long len = 0;
    do {
      final Z t = v.subtract(u).subtract(mN).abs();
      u = v;
      v = t;
      ++len;
    } while (!u.equals(x) || !v.equals(y));
    return Z.valueOf(len);
  }
}
