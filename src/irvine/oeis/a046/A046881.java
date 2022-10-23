package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046881 Smallest number that is sum of 2 positive distinct n-th powers in 2 different ways.
 * @author Sean A. Irvine
 */
public class A046881 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final TreeSet<Z> seen = new TreeSet<>();
    long m = 1;
    Z mp = Z.ONE;
    while (true) {
      while (seen.isEmpty() || mp.compareTo(seen.first()) < 0) {
        for (long k = 1; k < m; ++k) {
          final Z t = mp.add(Z.valueOf(k).pow(mN));
          if (!seen.add(t)) {
            return t;
          }
        }
        mp = Z.valueOf(++m).pow(mN);
      }
      seen.pollFirst();
    }
  }
}
