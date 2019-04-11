package irvine.oeis.a013;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013653 Period of continued fraction for <code>sqrt(n)</code> contains exactly two 1's and they are not consecutive.
 * @author Sean A. Irvine
 */
public class A013653 implements Sequence {

  private long mN = 1;

  protected int targetOnes() {
    return 2;
  }

  protected boolean test(final int oneCount, final boolean consecutiveOne) {
    return oneCount > targetOnes() || consecutiveOne;
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
      boolean consecutiveOne = false;
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
            if (oneCount >= targetOnes()) {
              return Z.valueOf(mN);
            } else {
              continue outer;
            }
          }
        }
        f = p.get(k).add(f0).divide(q.get(k));
        if (Z.ONE.equals(f)) {
          if (test(++oneCount, consecutiveOne)) {
            break;
          }
          consecutiveOne = true;
        } else {
          consecutiveOne = false;
        }
      }
    }
  }
}
