package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000042;

/**
 * A046420 Prime factors of repunit of length a(n) are all of different lengths.
 * @author Sean A. Irvine
 */
public class A046420 extends A000042 {

  private long mN = 0;

  private boolean is(final Z rep) {
    final TreeSet<Integer> seen = new TreeSet<>();
    final FactorSequence fs = Jaguar.factor(rep);
    if (fs.maxExponent() > 1) {
      return false;
    }
    for (final Z p : fs.toZArray()) {
      if (!seen.add(p.toString().length())) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (is(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
