package irvine.oeis.a392;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392038 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A392038 extends Sequence0 {

  // Only good for a few terms

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    HashSet<Z> values = new HashSet<>();
    values.add(Z.ONE.pow(mN)); // WLOG assume sign=1 for 1
    long k = 1;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN);
      final HashSet<Z> next = new HashSet<>();
      for (final Z v : values) {
        final Z a = v.add(t);
        if (a.equals(n)) {
          return Z.valueOf(k);
        }
        next.add(a);
        final Z b = v.subtract(t).abs();
        if (b.equals(n)) {
          return Z.valueOf(k);
        }
        next.add(b);
      }
      values = next;
    }
  }
}

