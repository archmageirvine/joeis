package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A080892 Numbers n such that <code>3^n-2</code> is a semiprime.
 * @author Sean A. Irvine
 */
public class A080892 implements Sequence {

  private int mN = 2;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z candidate = Z.THREE.pow(mN).subtract(2);
      if (mVerbose) {
        System.out.println("[" + mN + "]");
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

  /**
   * Generate from specified start.
   * @param args ignored
   */
  public static void main(final String[] args) {
    final A080892 seq = new A080892();
    if (args.length > 0) {
      seq.mN = Integer.parseInt(args[0]) - 1;
    }
    long n = seq.mN;
    while (true) {
      System.out.println(++n + " " + seq.next());
    }
  }
}

