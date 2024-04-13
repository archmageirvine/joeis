package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002025;

/**
 * A066871 Harshad (or Niven) amicable pairs: numbers which belong to an amicable pair in which both terms are Harshad (or Niven) numbers.
 * @author Sean A. Irvine
 */
public class A066871 extends Sequence1 {

  private final Sequence mA = new A002025();
  private Z mU = null;

  private static Z aliquot(final Z n) {
    return Jaguar.factor(n).sigma().subtract(n);
  }

  private boolean isHarshad(final Z n) {
    return n.mod(Functions.DIGIT_SUM.l(n)) == 0;
  }

  @Override
  public Z next() {
    if (mU != null) {
      final Z t = mU;
      mU = null;
      return t;
    }
    while (true) {
      final Z t = mA.next();
      if (isHarshad(t)) {
        final Z u = aliquot(t);
        if (isHarshad(u)) {
          mU = u;
          return t;
        }
      }
    }
  }
}
