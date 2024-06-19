package irvine.oeis.a070;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Function;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070841 Repdigits (A010785), excluding repunits (A002275), ordered by product of digits (A007954).
 * @author Sean A. Irvine
 */
public class A070841 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>(Comparator.comparing((Function<Z, Z>) Functions.DIGIT_PRODUCT::z).thenComparing(a -> a));
  {
    for (long k = 2; k < 10; ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  @Override
  public Z next() {
    final Z t = mA.pollFirst();
    if (!t.isZero()) {
      mA.add(t.multiply(10).add(t.mod(10)));
    }
    return t;
  }
}

