package irvine.oeis.a392;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392158 For each starting value n, the number of distinct terms in the sequence obtained by repeatedly doubling and then deleting repeated digits (keeping the first occurrence) until a term repeats.
 * @author Sean A. Irvine
 */
public class A392158 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(t)) {
      final String s = t.multiply2().toString();
      int syn = 0;
      t = Z.ZERO;
      for (int k = 0; k < s.length(); ++k) {
        final int v = s.charAt(k) - '0';
        if ((syn & (1 << v)) == 0) {
          syn |= 1 << v;
          t = t.multiply(10).add(v);
        }
      }
    }
    return Z.valueOf(seen.size());
  }
}

