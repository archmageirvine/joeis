package irvine.oeis.a070;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.ToLongFunction;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070840 Repdigits (A010785) ordered by sum of digits (A007953).
 * @author Sean A. Irvine
 */
public class A070840 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>(Comparator.comparingLong((ToLongFunction<Z>) Functions.DIGIT_SUM::l).thenComparing(a -> a));
  {
    for (long k = 0; k < 10; ++k) {
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

