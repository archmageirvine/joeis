package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.prime.HomePrimeSequence;
import irvine.util.string.StringUtils;

/**
 * A066808.
 * @author Sean A. Irvine
 */
public class A066817 extends A002808 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Z next() {
    final Z composite = super.next();
    final Sequence seq = new HomePrimeSequence(composite.longValueExact(), 10, false, HomePrimeSequence.HomePrimeType.ALONSO_WITH_ONE);
    try {
      while (true) {
        final Z t = seq.next();
        if (t.isProbablePrime()) {
          return t;
        }
      }
    } catch (final UnsupportedOperationException e) {
      if (mVerbose) {
        StringUtils.message("Starting from " + composite + ": " + e.getMessage());
      }
      return Z.ZERO; // We hit some number we could not factor
    }
  }

  /**
   * Run a specific term of this sequence without heuristic.
   * @param args term to compute
   */
  public static void main(final String[] args) {
    final long start = Long.parseLong(args[0]);
    final Sequence seq = new HomePrimeSequence(start, 10, false, HomePrimeSequence.HomePrimeType.ALONSO_WITH_ONE);
    while (true) {
      final Z t = seq.next();
      System.out.println(t);
      if (t.isProbablePrime()) {
        return;
      }
    }
  }
}

