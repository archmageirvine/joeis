package irvine.oeis.a074;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074460 Primes which are sandwiched between two numbers having the same unordered canonical form.
 * @author Sean A. Irvine
 */
public class A074460 extends A000040 {

  private boolean is(final Z n) {
    final FactorSequence fm = Jaguar.factor(n.subtract(1));
    final FactorSequence fp = Jaguar.factor(n.add(1));
    if (fm.omega() != fp.omega()) {
      return false;
    }
    final int[] em = new int[fm.omega()];
    final int[] ep = new int[fm.omega()];
    final Z[] m = fm.toZArray();
    final Z[] p = fp.toZArray();
    for (int k = 0; k < m.length; ++k) {
      em[k] = fm.getExponent(m[k]);
      ep[k] = fp.getExponent(p[k]);
    }
    Arrays.sort(em);
    Arrays.sort(ep);
    return Arrays.equals(em, ep);
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
