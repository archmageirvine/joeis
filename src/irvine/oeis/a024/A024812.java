package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024812 Numbers n for which there is exactly one positive integer m such that n = floor(cot(Pi/(2m))).
 * @author Sean A. Irvine
 */
public class A024812 implements Sequence {

  private long mN = 3;

  private Z f(final long n) {
    return ComputableReals.SINGLETON.tan(CR.ONE.subtract(CR.valueOf(n).inverse()).multiply(CR.HALF_PI)).floor();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z fa = f(mN - 1);
      final Z fb = f(mN);
      if (fa.compareTo(fb) < 0) {
        final Z fc = f(mN + 1);
        if (fb.compareTo(fc) < 0) {
          return fb;
        }
      }
    }
  }
}
