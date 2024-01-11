package irvine.oeis.a102;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A102191 Iccanobirt semiprimes (1 of 15): Semiprime numbers in A102111.
 * @author Georg Fischer
 */
public class A102191 extends Sequence1 {

  private final Sequence mSeq;

  /** Construct the sequence. */
  public A102191() {
    this(new A102111());
  }

  /**
   * Generic constructor with parameters
   * @param seq
   */
  public A102191(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    while (true) {
      final Z candidate = mSeq.next();
      final FactorSequence fs = Jaguar.factorUpToSemiprime(candidate);
      final int sp = fs.semiprimeStatus();
      if (sp == FactorSequence.YES) {
        return candidate;
      }
      if (sp == FactorSequence.UNKNOWN) {
        throw new UnsupportedOperationException("Cannot determine if " + candidate + " is semiprime");
      }
    }
  }
}
