package irvine.oeis.a394;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a052.A052486;

/**
 * A394000 Achilles numbers whose prime power factor exponents are not all pairwise coprime.
 * @author Sean A. Irvine
 */
public class A394000 extends Sequence1 {

  private final Sequence mS;

  protected A394000(final Sequence seq) {
    mS = seq;
  }

  /** Construct the sequence. */
  public A394000() {
    this(new A052486());
  }

  private boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] primes = fs.toZArray();
    for (final Z p : primes) {
      for (final Z q : primes) {
        if (p.equals(q)) {
          break;
        }
        if (Functions.GCD.i(fs.getExponent(p), fs.getExponent(q)) != 1) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z k = mS.next();
      if (is(k)) {
        return k;
      }
    }
  }
}
