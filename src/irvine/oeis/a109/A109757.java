package irvine.oeis.a109;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A109757 Numbers n such that <code>(10</code>'s complement factorial of <code>n) + 1</code> is semiprime.
 * @author Sean A. Irvine
 */
public class A109757 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mN = 0;

  private static long tensComplement(final long n) {
    long s = 1;
    while (s <= n) {
      s *= 10L;
    }
    return s - n;
  }

  static Z tensComplementFactorial(final long n) {
    Z p = Z.ONE;
    for (long k = 1; k <= n; ++k) {
      p = p.multiply(tensComplement(k));
    }
    return p;
  }

  @Override
  public Z next() {
    while (true) {
      final Z candidate = tensComplementFactorial(++mN).add(1);
      if (mVerbose) {
        System.out.println("[" + mN + "]: " + candidate);
        System.out.flush();
      }
      final FactorSequence fs = Jaguar.factorAllowIncomplete(candidate);
      final int sp = fs.isSemiprime();
      if (sp == FactorSequence.YES) {
        return Z.valueOf(mN);
      }
      if (sp == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException("Cannot determine if " + candidate + " is semiprime");
      }
    }
  }
}

