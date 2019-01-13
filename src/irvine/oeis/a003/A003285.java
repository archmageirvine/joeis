package irvine.oeis.a003;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003285.
 * @author Sean A. Irvine
 */
public class A003285 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z[] sqrt = n.sqrtAndRemainder();
    if (Z.ZERO.equals(sqrt[1])) {
      return Z.ZERO;
    }
    final Z f0 = sqrt[0];
    Z f = f0;
    final ArrayList<Z> p = new ArrayList<>();
    p.add(Z.ZERO);
    final ArrayList<Z> q = new ArrayList<>();
    q.add(Z.ONE);
    int k = 0;
    while (true) {
      p.add(q.get(k).multiply(f).subtract(p.get(k)));
      q.add(n.subtract(p.get(k + 1).square()).divide(q.get(k)));
      ++k;
      for (int i = 0; i < k; ++i) {
        if (p.get(i).equals(p.get(k)) && q.get(i).equals(q.get(k))) {
          return Z.valueOf(k - i);
        }
      }
      f = p.get(k).add(f0).divide(q.get(k));
    }
  }
}
