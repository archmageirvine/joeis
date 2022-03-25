package irvine.oeis.a055;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a024.A024785;

/**
 * A055521 Restricted left truncatable (Henry VIII) primes.
 * @author Sean A. Irvine
 */
public class A055521 extends A024785 {

  private final TreeSet<Z> mSeq = new TreeSet<>();
  {
    // Precompute entire sequence based on A024785
    final ArrayList<String> l = new ArrayList<>();
    Z t;
    while ((t = super.next()) != null) {
      if (t.compareTo(Z.NINE) > 0) {
        l.add(t.toString());
      }
    }
    outer:
    for (int k = l.size() - 1; k > 0; --k) {
      final String s = l.get(k);
      for (int j = k + 1; j < l.size(); ++j) {
        if (l.get(j).endsWith(s)) {
          continue outer;
        }
      }
      mSeq.add(new Z(s));
    }
  }

  @Override
  public Z next() {
    return mSeq.isEmpty() ? null : mSeq.pollFirst();
  }
}
