package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a008.A008849;

/**
 * A046872 F-primes.
 * @author Sean A. Irvine
 */
public class A046872 extends A008849 {

  // Very slow because A008849 is slow.

  private final TreeSet<Z> mFPrimes = new TreeSet<>();
  {
    super.next(); // skip 1
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final FactorSequence fs = Jaguar.factor(super.next());
      if (fs.isSquareFree()) {
        final Z[] p = fs.toZArray();
        for (int k = 0; k < p.length - 1; ++k) {
          if (mFPrimes.contains(p[k])) {
            continue outer;
          }
        }
        mFPrimes.add(p[p.length - 1]);
        return p[p.length - 1];
      }
    }
  }
}
