package irvine.oeis.a050;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A050703 Numbers that when added to the sum of their prime factors (with multiplicity) become prime.
 * @author Sean A. Irvine
 */
public class A050703 extends AbstractSequence {

  /** Construct the sequence. */
  public A050703() {
    super(1);
  }

  private long mN = 1;

  protected Z f(final Z n) {
    return Jaguar.factor(n).sopfr().add(n);
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
