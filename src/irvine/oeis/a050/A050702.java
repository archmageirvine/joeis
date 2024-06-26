package irvine.oeis.a050;

import java.util.Collections;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050702 Nonprime numbers n such that n and n-reversed (&lt;&gt;n and no leading zeros) have the same number of prime factors and these prime factors (palindromes allowed here) are also reversals of each other.
 * @author Sean A. Irvine
 */
public class A050702 extends Sequence1 {

  private long mN = 25;

  @Override
  public Z next() {
    outer:
    while (true) {
      if (++mN % 10 != 0) {
        final long rev = Functions.REVERSE.l(mN);
        if (rev != mN) {
          final FactorSequence fs = Jaguar.factor(mN);
          if (fs.bigOmega() > 1) {
            final FactorSequence revfs = Jaguar.factor(rev);
            if (revfs.omega() == fs.omega()) {
              final TreeSet<Z> factors = new TreeSet<>();
              Collections.addAll(factors, fs.toZArray());
              for (final Z p : revfs.toZArray()) {
                if (!factors.contains(Functions.REVERSE.z(p))) {
                  continue outer;
                }
              }
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}
