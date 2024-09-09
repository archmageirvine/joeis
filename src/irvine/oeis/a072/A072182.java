package irvine.oeis.a072;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.InverseSigma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072182 extends Sequence1 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = 3;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final Z n2 = Z.valueOf(++mN).square();
      for (final Z t : InverseSigma.inverseSigma(Functions.SIGMA1.z(n2), 1)) {
        if (t.compareTo(n2) > 0 && Predicates.SQUARE.is(t)) {
          mA.add(mN);
        }
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
