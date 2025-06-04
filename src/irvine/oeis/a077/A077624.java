package irvine.oeis.a077;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077624 Largest term in periodic part of continued fraction expansion of square root of 2^n + 1 or 0 if 2^n + 1 is a square.
 * @author Sean A. Irvine
 */
public class A077624 extends Sequence1 {

  private long mN = 0;

  protected Z maxTerm(final Z n) {
    final Z[] sqrt = n.sqrtAndRemainder();
    if (sqrt[1].isZero()) {
      return Z.ZERO;
    }
    final Z f0 = sqrt[0];
    Z f = f0;
    final ArrayList<Z> p = new ArrayList<>();
    p.add(Z.ZERO);
    final ArrayList<Z> q = new ArrayList<>();
    q.add(Z.ONE);
    Z max = Z.ZERO;
    int k = 0;
    while (true) {
      p.add(q.get(k).multiply(f).subtract(p.get(k)));
      q.add(n.subtract(p.get(k + 1).square()).divide(q.get(k)));
      ++k;
      for (int i = 0; i < k; ++i) {
        if (p.get(i).equals(p.get(k)) && q.get(i).equals(q.get(k))) {
          return max;
        }
      }
      f = p.get(k).add(f0).divide(q.get(k));
      max = max.max(f);
    }
  }

  @Override
  public Z next() {
    return maxTerm(Z.ONE.shiftLeft(++mN).add(1));
  }
}
