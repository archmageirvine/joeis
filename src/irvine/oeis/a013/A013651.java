package irvine.oeis.a013;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013651 Period of continued fraction for <code>sqrt(n)</code> contains at least two 1's.
 * @author Sean A. Irvine
 */
public class A013651 implements Sequence {

  private long mN = 1;

  protected int targetOnes() {
    return 2;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z n = Z.valueOf(++mN);
      final Z[] sqrt = n.sqrtAndRemainder();
      if (Z.ZERO.equals(sqrt[1])) {
        continue;
      }
      int oneCount = 0;
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
            continue outer;
          }
        }
        f = p.get(k).add(f0).divide(q.get(k));
        if (Z.ONE.equals(f) && ++oneCount >= targetOnes()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
