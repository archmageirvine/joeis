package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000108;

/**
 * A081389 Number of non-unitary prime divisors of Catalan numbers, i.e., number of those prime factors whose exponent is greater than one.
 * @author Sean A. Irvine
 */
public class A081389 extends Sequence1 {

  private final Sequence mCatalan = new A000108().skip();

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(mCatalan.next());
    long cnt = 0;
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) > 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

