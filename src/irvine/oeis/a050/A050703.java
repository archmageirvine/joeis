package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050703 Numbers that when added to the sum of their prime factors (with multiplicity) become prime.
 * @author Sean A. Irvine
 */
public class A050703 implements Sequence {

  private long mN = 1;

  protected Z f(final Z n) {
    return Cheetah.factor(n).sopfr().add(n);
  }

  protected int iterations() {
    return 1;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (!n.isProbablePrime()) {
        Z t = n;
        for (int k = 1; k < iterations(); ++k) {
          t = f(t);
          if (t.isProbablePrime()) {
            continue outer;
          }
        }
        t = f(t);
        if (t.isProbablePrime()) {
          return n;
        }
      }
    }
  }
}
