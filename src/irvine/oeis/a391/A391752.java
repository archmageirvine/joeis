package irvine.oeis.a391;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A391752 First nonzero digit in the decimal expansion of 1/Fibonacci(n).
 * @author Sean A. Irvine
 */
public class A391752 extends Sequence1 {

  private final Sequence mF = new A000045().skip();

  @Override
  public Z next() {
    CR r = CR.valueOf(mF.next()).inverse();
    while (true) {
      final Z d = r.floor();
      if (!d.isZero()) {
        return d;
      }
      r = r.multiply(10);
    }
  }
}
