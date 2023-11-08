package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.prime.HomePrimeSequence;

/**
 * A066808.
 * @author Sean A. Irvine
 */
public class A066817 extends A002808 {

  @Override
  public Z next() {
    final Z composite = super.next();
    final Sequence seq = new HomePrimeSequence(composite.longValueExact(), 10, false, HomePrimeSequence.HomePrimeType.ALONSO_WITH_ONE);
    while (true) {
      final Z t = seq.next();
      if (t.isProbablePrime()) {
        return t;
      }
      if (t.bitLength() > 200) { // todo remove or increase this restriction
        return Z.ZERO;
      }
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

